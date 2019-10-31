import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Random;
public class PlayByPlaySim {
	public static void main(String[]args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(new File("footballstats.txt"));
		Scanner s2 = new Scanner(new File("Footballdef.txt"));
		Scanner s3 = new Scanner(new File("SpecialTeams.txt"));
		Scanner s4 = new Scanner(new File("kickoffs.txt"));
		Scanner s5 = new Scanner(new File("Kickrets.txt"));
		Scanner s6 = new Scanner(new File("Oppkickret.txt"));
		Scanner s7 = new Scanner(new File("puntreturn.txt"));
		ArrayList<Team> teams = new ArrayList<Team>();
		ArrayList<FootballDef> teamdefs = new ArrayList<FootballDef>();
		ArrayList<SpecialTeams> specials = new ArrayList<SpecialTeams>();
		
		while(s.hasNextLine())
		{
			String[] tokens = s.nextLine().split("	");
			int in1 = Integer.parseInt(tokens[0]);
			int in2 = Integer.parseInt(tokens[2]);
			double d1 = Double.parseDouble(tokens[3]);
			double d2 = Double.parseDouble(tokens[4]);
			double d3 = Double.parseDouble(tokens[5]);
			double d4 = Double.parseDouble(tokens[6]);
			double d5 = Double.parseDouble(tokens[7]);
			double d6 = Double.parseDouble(tokens[8]);
			double d7 = Double.parseDouble(tokens[9]);
			double d8 = Double.parseDouble(tokens[10]);
			double d9 = Double.parseDouble(tokens[11]);
			double d10 = Double.parseDouble(tokens[12]);
			double d11 = Double.parseDouble(tokens[13]);
			double d12 = Double.parseDouble(tokens[14]);
			double d13 = Double.parseDouble(tokens[15]);
			double d14 = Double.parseDouble(tokens[16]);
			double d15 = Double.parseDouble(tokens[17]);
			double d16 = Double.parseDouble(tokens[18]);
			double d17 = Double.parseDouble(tokens[19]);
			double d18 = Double.parseDouble(tokens[20]);
			double d19 = Double.parseDouble(tokens[21]);
			double d20 = Double.parseDouble(tokens[22]);
			double d21 = Double.parseDouble(tokens[23]);
			double d22 = Double.parseDouble(tokens[24]);
		teams.add(new Team(in1, tokens[1], in2, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14,
				d15, d16, d17, d18, d19, d20, d21, d22));
		System.out.println(tokens);
		
		}
		
		while(s2.hasNextLine())
        {
            String[] tokens1 = s2.nextLine().split("	");
            System.out.println(tokens1);
            int in1 = Integer.parseInt(tokens1[0]);
            int in2 = Integer.parseInt(tokens1[2]);
            double d1 = Double.parseDouble(tokens1[3]);
            double d2 = Double.parseDouble(tokens1[4]);
            double d3 = Double.parseDouble(tokens1[5]);
            double d4 = Double.parseDouble(tokens1[6]);
            double d5 = Double.parseDouble(tokens1[7]);
            double d6 = Double.parseDouble(tokens1[8]);
            double d7 = Double.parseDouble(tokens1[9]);
            double d8 = Double.parseDouble(tokens1[10]);
            double d9 = Double.parseDouble(tokens1[11]);
            double d10 = Double.parseDouble(tokens1[12]);
            double d11 = Double.parseDouble(tokens1[13]);
            double d12 = Double.parseDouble(tokens1[14]);
            double d13 = Double.parseDouble(tokens1[15]);
            double d14 = Double.parseDouble(tokens1[16]);
            double d15 = Double.parseDouble(tokens1[17]);
            double d16 = Double.parseDouble(tokens1[18]);
            double d17 = Double.parseDouble(tokens1[19]);
            double d18 = Double.parseDouble(tokens1[20]);
            double d19 = Double.parseDouble(tokens1[21]);
            double d20 = Double.parseDouble(tokens1[22]);
            double d21 = Double.parseDouble(tokens1[23]);
            double d22 = Double.parseDouble(tokens1[24]);
        teamdefs.add(new FootballDef(in1, tokens1[1], in2, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14,
                d15, d16, d17, d18, d19, d20, d21, d22));
        
        
        }
		int a = 0;
		
			String name = "";
			double xpp = 0;
			double fgp = 0;
			double puntavg = 0;
			double tchbkpct = 0;
			double kickavg = 0;
			double oobpct = 0;
			double kickretavg = 0;
			double kickrettdrate = 0;
			double oppkickretavg = 0;
			double punttchbckpct = 0;
			double puntretavg = 0;
			double puntrettdrate = 0;
		
		while(s3.hasNextLine())
		{
			String[] tokens2 = s3.nextLine().split("	");
			xpp = (Double.parseDouble(tokens2[5]))/100;
			fgp = (Double.parseDouble(tokens2[8]))/100;
			puntavg = Double.parseDouble(tokens2[12]);
			specials.add(new SpecialTeams(tokens2[1], xpp, fgp, puntavg, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			
		}
		while(s4.hasNextLine())
		{
			String[] tokens3 = s4.nextLine().split("	");
			tchbkpct = (Double.parseDouble(tokens3[7]))/100;
			kickavg = ((Double.parseDouble(tokens3[3]) - (Double.parseDouble(tokens3[5])*65))/(Double.parseDouble(tokens3[2]) - Double.parseDouble(tokens3[5])));
		    oobpct = (Double.parseDouble(tokens3[7])/Double.parseDouble(tokens3[2]));
		    for(int i = 0; i < specials.size(); i++)
		    {
		    	if(specials.get(i).getName().contentEquals(tokens3[1]))
		    	{
		    		specials.get(i).setTchbkPct(tchbkpct);
		    		specials.get(i).setKickAvg(kickavg);
		    		specials.get(i).setOobPct(oobpct);
		    	}
		    }
		
		}
		while(s5.hasNextLine())
		{
			String[] tokens4 = s5.nextLine().split("	");
			kickretavg = (Double.parseDouble(tokens4[5]));
			kickrettdrate = ((Double.parseDouble(tokens4[6]))/(Double.parseDouble(tokens4[3])));
		    
		    for(int i = 0; i < specials.size(); i++)
		    {
		    	if(specials.get(i).getName().contentEquals(tokens4[1]))
		    	{
		    		specials.get(i).setKickRetAvg(kickretavg);
		    		specials.get(i).setKickRetTdRate(kickrettdrate);
		    		
		    	}
		    }
		
		}
		while(s6.hasNextLine())
		{
			String[] tokens5 = s6.nextLine().split("	");
			oppkickretavg = (Double.parseDouble(tokens5[5]));
			
		    
		    for(int i = 0; i < specials.size(); i++)
		    {
		    	if(specials.get(i).getName().contentEquals(tokens5[1]))
		    	{
		    		specials.get(i).setOppKickRetAvg(oppkickretavg);
		    		
		    		
		    	}
		    }
		
		}
		while(s7.hasNextLine())
		{
			String[] tokens6 = s7.nextLine().split("	");
			puntretavg = (Double.parseDouble(tokens6[5]));
			puntrettdrate = (Double.parseDouble(tokens6[6]))/Double.parseDouble(tokens6[3]);
		    
		    for(int i = 0; i < specials.size(); i++)
		    {
		    	if(specials.get(i).getName().contentEquals(tokens6[1]))
		    	{
		    		specials.get(i).setPuntRetAvg(puntretavg);
		    		specials.get(i).setPuntRetTdRate(puntrettdrate);
		    		
		    		
		    		
		    	}
		    }
		
		}
		
		
		
		
		
		
		int mn = 0;
		while(mn == 0)
		{
			System.out.println("Press 1 to start");
			mn++;
			
		}
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			Team team1a = new Team(0, "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			Team team1b = new Team(0, "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			FootballDef teamdef1a = new FootballDef(0, "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			FootballDef teamdef1b = new FootballDef(0, "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			String team1 = " ";
			String team2 = " ";
			double team1Ratio = 0;
			double team2Ratio = 0;
			double team1YPPass = 0;
			double team2YPPass = 0;
			double team1YPRush = 0;
			double team2YPRush = 0;
			double team1YPPassd = 0;
			double team2YPPassd = 0;
			double team1YPRushd = 0;
			double team2YPRushd = 0;
			boolean oneGotBallFirst = true;
			int team1Points = 0;
			int team2Points = 0;
			int down = 1;
			int toGo = 10;
			int qb1yds = 0;
			int qb2yds = 0;
			boolean firstHalf = true;
			int clock = 1800;
			int yardLine = 0;
			boolean oneHasBall = true;
			SpecialTeams spec1 = new SpecialTeams(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			SpecialTeams spec2 = new SpecialTeams(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			System.out.println("Enter team 1: ");
			team1 = sc.next();
			System.out.println("Enter team 2: ");
			team2 = sc.next();
			for(int i = 0; i < teams.size(); i ++)
			{
				if(teams.get(i).getName().contentEquals(team1)) {
					team1a = teams.get(i);
					team1Ratio = teams.get(i).getPasses()/teams.get(i).getRushes();
			
					team1YPPass = teams.get(i).getPassYards()/teams.get(i).getPasses();
					team1YPRush = teams.get(i).getRushYards()/teams.get(i).getRushes();
				}
				if(teams.get(i).getName().contentEquals(team2)) {
					team1b = teams.get(i);
					team2Ratio = teams.get(i).getPasses()/teams.get(i).getRushes();
					team2YPPass = teams.get(i).getPassYards()/teams.get(i).getPasses();
					team2YPRush = teams.get(i).getRushYards()/teams.get(i).getRushes();
				
				}
			}
			for(int j = 0; j < teamdefs.size(); j ++)
			{
				if(teamdefs.get(j).getName().contentEquals(team1)) {
					
					teamdef1a = teamdefs.get(j);
					
					
				}
				if(teamdefs.get(j).getName().contentEquals(team2)) {
					teamdef1b = teamdefs.get(j);
					
				}
			}
			for(int k = 0; k < specials.size(); k ++)
			{
				if(specials.get(k).getName().contentEquals(team1)) {
					
					spec1 = specials.get(k);
					
					
				}
				if(specials.get(k).getName().contentEquals(team2)) {
					
					spec2 = specials.get(k);
					
				}
			}
			
			Random random1 = new Random();
			int coin = random1.nextInt(1000) + 1;
			
			if(coin > 500)
			{
			yardLine += kickoff(spec1, spec2);
			clock -= 11;
			oneHasBall = false;
			oneGotBallFirst = false;
			}
			else
			yardLine += kickoff(spec2, spec1);
			clock -= 11;
			while(clock > 0)
			{
				if(oneHasBall)
				{
				
				while(down < 4)
				{
					
					
						
						Random random = new Random();
						int ran = random.nextInt(1000) + 1;
						
						{
							if((team1Ratio/(team1Ratio + 1))*1000 > ran)
							{
								int p = pass(team1a, teamdef1b);
								toGo -= p;
								yardLine += p;
								qb1yds += p;
								down++;
								clock -= 14;
							}
							else
							{
								int r = run(team1a, teamdef1b);
								toGo -= r;
								yardLine += r;
								
								down++;
								clock -= 25;
							}
								
						}
						if(toGo < 1)
						{
							down = 1;
							toGo = 10;
						}
						if(yardLine > 99)
						{
							team1Points += 7;
							down = 5;
						}
						
				}
				if(down == 4)
				{
					
					if(yardLine > 65)
					{
						
						team1Points += fieldGoal(spec1);
						
					yardLine = kickoff(spec1, spec2);
					
					down = 1;
					oneHasBall = false;
					clock -= 17;
					}
					else
					{
						
					oneHasBall = false;
					int rslt = punt(spec1, spec2);
					
					if(rslt == 10000)
					{
						yardLine = 0;
						team2Points +=7;
						yardLine += kickoff(spec2, spec1);
						
						clock -= 25;
						oneHasBall = true;
					}
					else if(rslt == 10001)
					{
						yardLine = 20;
						clock -= 8;
					}
					else
					{
						yardLine =+ rslt;
						yardLine = 100 - yardLine;
					
						if(yardLine < 0)
						{
							yardLine = 20;
						}
						clock -= 10;
					}
					down = 1;
					}
				}
				if(down == 5)
				{
					
					yardLine = kickoff(spec1, spec2);
					
					clock -= 11;
					oneHasBall = false;
					down = 1;
				}
				}
			
			if(!oneHasBall)
			{
			
			while(down < 4)
			{
				
				
					
					Random random = new Random();
					int ran = random.nextInt(1000) + 1;
					{
						if((team2Ratio/(team2Ratio + 1))*1000 < ran)
						{
							int p = pass(team1b, teamdef1a);
							toGo -= p;
							yardLine += p;
							qb2yds += p;
							down++;
							clock -=18;
						}
						else
						{
							int r = run(team1b, teamdef1a);
							toGo -= r;
							yardLine += r;
							down++;
							clock -= 30;
						}
							
					}
					if(toGo < 1)
					{
						down = 1;
						toGo = 10;
					}
					if(yardLine > 99)
					{
						team2Points += 7;
						down = 5;
					}
					
			}
			if(down == 4)
			{
				
				if(yardLine > 65)
				{
					team2Points += fieldGoal(spec1);
				yardLine = kickoff(spec2, spec1);
				down = 1;
				oneHasBall = true;
				clock -= 17;
				}
				else
				{
				oneHasBall = true;
				int rslt = punt(spec2, spec1);
				if(rslt == 10000)
				{
					yardLine = 0;
					team1Points +=7;
					yardLine += kickoff(spec1, spec2);
					clock -= 25;
					oneHasBall = false;
				}
				else if(rslt == 10001)
				{
					yardLine = 20;
					clock -= 8;
				}
				else
				{
					yardLine =+ rslt;
					yardLine = 100 - yardLine;
					if(yardLine < 0)
					{
						yardLine = 20;
					}
					clock -= 10;
				}
				down = 1;
				}
			}
			if(down == 5)
			{
				yardLine = kickoff(spec2, spec1);
				clock -= 11;
				oneHasBall = true;
				down = 1;
			}
			}
		}
			down = 1;
			toGo = 10;
			yardLine = 0;
			clock = 1800;
			if(oneGotBallFirst)
			{
				yardLine += kickoff(spec1, spec2);
				clock -= 11;
				oneHasBall = false;
			}
			else
			{
				yardLine += kickoff(spec2, spec1);
				clock -= 11;
				oneHasBall = true;
			}
			{
				if(oneHasBall)
				{
				
				while(down < 4)
				{
					
					
						
						Random random = new Random();
						int ran = random.nextInt(1000) + 1;
						
						{
							if((team1Ratio/(team1Ratio + 1))*1000 > ran)
							{
								int p = pass(team1a, teamdef1b);
								toGo -= p;
								yardLine += p;
								qb1yds += p;
								down++;
								clock -=18;
							}
							else
							{
								int r = run(team1a, teamdef1b);
								toGo -= r;
								yardLine += r;
								
								down++;
								clock -= 25;
							}
								
						}
						if(toGo < 1)
						{
							down = 1;
							toGo = 10;
						}
						if(yardLine > 99)
						{
							team1Points += 7;
							down = 5;
						}
						
				}
				if(down == 4)
				{
					
					if(yardLine > 65)
					{
						
						team1Points += fieldGoal(spec1);
						
					yardLine = kickoff(spec1, spec2);
					
					down = 1;
					oneHasBall = false;
					clock -= 17;
					}
					else
					{
						
					oneHasBall = false;
					int rslt = punt(spec1, spec2);
					
					if(rslt == 10000)
					{
						yardLine = 0;
						team2Points +=7;
						yardLine += kickoff(spec2, spec1);
						
						clock -= 25;
						oneHasBall = true;
					}
					else if(rslt == 10001)
					{
						yardLine = 20;
						clock -= 8;
					}
					else
					{
						yardLine =+ rslt;
						yardLine = 100 - yardLine;
					
						if(yardLine < 0)
						{
							yardLine = 20;
						}
						clock -= 10;
					}
					down = 1;
					}
				}
				if(down == 5)
				{
					
					yardLine = kickoff(spec1, spec2);
					
					clock -= 11;
					oneHasBall = false;
					down = 1;
				}
				}
			
			if(!oneHasBall)
			{
			
			while(down < 4)
			{
				
				
					
					Random random = new Random();
					int ran = random.nextInt(1000) + 1;
					{
						if((team2Ratio/(team2Ratio + 1))*1000 < ran)
						{
							int p = pass(team1b, teamdef1a);
							toGo -= p;
							yardLine += p;
							qb2yds += p;
							down++;
							clock -=18;
						}
						else
						{
							int r = run(team1b, teamdef1a);
							toGo -= r;
							yardLine += r;
							down++;
							clock -= 30;
						}
							
					}
					if(toGo < 1)
					{
						down = 1;
						toGo = 10;
					}
					if(yardLine > 99)
					{
						team2Points += 7;
						down = 5;
					}
					
			}
			if(down == 4)
			{
				
				if(yardLine > 65)
				{
					team2Points += fieldGoal(spec1);
				yardLine = kickoff(spec2, spec1);
				down = 1;
				oneHasBall = true;
				clock -= 17;
				}
				else
				{
				oneHasBall = true;
				int rslt = punt(spec2, spec1);
				if(rslt == 10000)
				{
					yardLine = 0;
					team1Points +=7;
					yardLine += kickoff(spec1, spec2);
					clock -= 25;
					oneHasBall = false;
				}
				else if(rslt == 10001)
				{
					yardLine = 20;
					clock -= 8;
				}
				else
				{
					yardLine =+ rslt;
					yardLine = 100 - yardLine;
					if(yardLine < 0)
					{
						yardLine = 20;
					}
					clock -= 10;
				}
				down = 1;
				}
			}
			if(down == 5)
			{
				yardLine = kickoff(spec2, spec1);
				clock -= 11;
				oneHasBall = true;
				down = 1;
			}
			}
		}
			
			System.out.println(team1Points + "    " + team2Points); 
			System.out.println(team1a.getName() + " QB Passing Yards: " + qb1yds + " " + team1b.getName() + " QB Passing Yards: " + qb2yds);
		}	
		}
		
	public static int kickoff(SpecialTeams s1, SpecialTeams s2)
	{
		Random random = new Random();
		int a = random.nextInt(1000) + 1;
		if(s1.getTchbkPct()*10000 > a)
		return 25;
		else
		{
	
		double b = s1.getKickAvg();
		double c = s1.getOppKickRetAvg() + s2.getKickRetAvg();
		c /= 2;
		Random r = new Random();
		double d = r.nextGaussian()*3+c;
		d += 75;
		d -= b;
		return (int) d;
		
		}
	}
	public static int pass(Team t1, FootballDef t2)
	{
		Random random = new Random();
		int a = random.nextInt(1000) + 1;
		if(t1.getPercentage()*10 < a)
		return 0;
		else
		{
	
		double b = t1.getPassYards()/t1.getPasses();
	
		double c = t2.getPassYards()/t2.getPasses();
		
		 b += c;
		b /= 2;
		Random r = new Random();
		double d = r.nextGaussian()*3+b;
		if(d < 0)
		d = 0;
		
		return (int) d;
		
		}
	}
	public static int run(Team t1, FootballDef t2)
	{
		
		
		
	
		double b = t1.getRushYards()/t1.getRushes();
		double c = t2.getRushYards()/t2.getRushes();
		b += c;
		b /= 2;
		Random r = new Random();
		double d = r.nextGaussian()*2+b;
		if(d < -2)
		d = -2;
		
		return (int) d;
		
		
	}
	public static int fieldGoal(SpecialTeams s)
	{
		
		
		
		Random random = new Random();
		double b = s.getFgp();
		int a = random.nextInt(1000) + 1;
		if(b*1000 < a)
		return 0;
		return 3;
		
		
	}
	public static int punt(SpecialTeams s1, SpecialTeams s2)
	{
		
		
		
		Random random = new Random();
		double b = s1.getPuntAvg();
		double c = s2.getPuntRetAvg();
		b +=c;
		b /= 2;
		double d = s2.getPuntRetTdRate();
		double e = s1.getPuntTchbckpct();
		int a = random.nextInt(1000) + 1;
		if(d*10 > a)
		return 10000;
		if(e*10 > a)
		return 10001;
		Random r = new Random();
		double f = r.nextGaussian()*5+b;
		if(f < 30)
		f = 30;
		if(f > 60)
		f = 60;
		return (int) f;
		
	}
	
	
	
}
