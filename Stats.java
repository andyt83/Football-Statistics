import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Stats {

	
	
		public static void main(String[]args) throws FileNotFoundException
		{
			Scanner sc = new Scanner(System.in);
			Scanner s = new Scanner(new File("footballstats.txt"));
			Scanner s2 = new Scanner(new File("Footballdef.txt"));
			ArrayList<Team> teams = new ArrayList<Team>();
			ArrayList<FootballDef> teamdefs = new ArrayList<FootballDef>();
			
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
			
			int mn = 0;
			while(mn == 0)
			{
			System.out.println("Press 1 to get pass/rush ratio for a team");
			System.out.println("Press 2 to get pure offense for a team");
			System.out.println("Press 3 to get pass/rush ratio rankings");
			System.out.println("Press 4 to get pure offense rankings");
			System.out.println("Press 5 to simulate a match between two teams");
			System.out.println("Press 6 for full simulator");
			int choice = sc.nextInt();
			if(choice == 1)
			{
				double passes1 = 0;
				double rushes1 = 0;
				ArrayList<Double>prr = new ArrayList<Double>();
				ArrayList<String> prrTeams = new ArrayList<String>();
				for(int i = 0; i < teams.size(); i++)
				{
					passes1 = teams.get(i).getPasses();
					rushes1 = teams.get(i).getRushes();
					prr.add(passes1/rushes1);
					prrTeams.add(teams.get(i).getName());
				}
				
				System.out.println("Enter your team name: ");
				String tn = sc.next();
				for(int j = 0; j < teams.size(); j++)
				{
					if(prrTeams.get(j).contentEquals(tn))
					{
						System.out.println(prr.get(j));
					}
				}
					
				
			
				
				
				
			}
			else if(choice == 2)
			{
				double yards1 = 0;
				double penYards1 = 0;
				ArrayList<Double>puroff = new ArrayList<Double>();
				ArrayList<String> puroffTeams = new ArrayList<String>();
				for(int i = 0; i < teams.size(); i++)
				{
					yards1 = teams.get(i).getTotYards();
					penYards1 = teams.get(i).getPenYds();
					puroff.add(yards1 + penYards1);
					puroffTeams.add(teams.get(i).getName());
				}
				System.out.println("Enter your team name: ");
				String ten = sc.next();
				for(int j = 0; j < teams.size(); j++)
				{
					if(puroffTeams.get(j).contentEquals(ten))
					{
						System.out.println(puroff.get(j));
					}
				}
				
			}
			
			else if(choice == 3)
			{
			double passes1 = 0;
			double rushes1 = 0;
			ArrayList<Double>prr = new ArrayList<Double>();
			ArrayList<String> prrTeams = new ArrayList<String>();
			for(int b = 0; b < teams.size(); b++)
			{
				prrTeams.add("");
			}
			for(int i = 0; i < teams.size(); i++)
			{
				passes1 = teams.get(i).getPasses();
				rushes1 = teams.get(i).getRushes();
				prr.add(passes1/rushes1);
				prrTeams.add(teams.get(i).getName());
			}
			Collections.sort(prr);
			Collections.reverse(prr);
			int counts = 0;
			for(int k = 0; k < teams.size(); k++)
			{
				for(int a = 0; a < prr.size(); a++)
				{
					
				
				if(teams.get(k).getPasses()/teams.get(k).getRushes() == prr.get(a))
				{
					counts++;
					prrTeams.set(a, teams.get(k).getName());
					
					
				}
				}
			}
			for(int j = 0; j < prr.size(); j++)
			{
				System.out.println(j + 1 + ": " + prrTeams.get(j) + ": " + prr.get(j));
				
			}
			
		}
			else if(choice == 4)
			{
			double yards2 = 0;
			double penYards2 = 0;
			ArrayList<Double>purOff1 = new ArrayList<Double>();
			ArrayList<String> purOffTeams1 = new ArrayList<String>();
			for(int b = 0; b < teams.size(); b++)
			{
				purOffTeams1.add("");
			}
			for(int i = 0; i < teams.size(); i++)
			{
				yards2 = teams.get(i).getTotYards();
				penYards2 = teams.get(i).getPenYds();
				purOff1.add(yards2 + penYards2);
				purOffTeams1.add(teams.get(i).getName());
			}
			Collections.sort(purOff1);
			Collections.reverse(purOff1);
			int counts1 = 0;
			for(int k = 0; k < teams.size(); k++)
			{
				for(int a = 0; a < purOff1.size(); a++)
				{
					
				
				if(teams.get(k).getTotYards() + teams.get(k).getPenYds() == purOff1.get(a))
				{
					counts1++;
					purOffTeams1.set(a, teams.get(k).getName());
					
					
				}
				}
			}
			for(int j = 0; j < purOff1.size(); j++)
			{
				System.out.println(j + 1 + ": " + purOffTeams1.get(j) + ": " + purOff1.get(j));
				
			}
			
		}
			else if(choice == 5)
			{
				String team1name = "";
				String team2name = "";
				double team1pass = 0;
				double team1passd = 0;
				double team2pass = 0;
				double team2passd = 0;
				double team1run = 0;
				double team1rund = 0;
				double team2run = 0;
				double team2rund = 0;
				double team1yard = 0;
				double team2yard = 0;
				double team1pen = 0;
				double team2pen = 0;
				System.out.println("Enter the First Team: ");
				String theName = sc.next();
				for(int i = 0; i < teams.size(); i++)
				{
					if(teams.get(i).getName().contentEquals(theName))
					{
						team1name = teams.get(i).getName();
						team1pass = teams.get(i).getPassYards();
						team1run = teams.get(i).getRushYards();
						team1pen = teams.get(i).getPenYds();
					}
				}
				for(int j = 0; j < teamdefs.size(); j++)
				{
					if(teamdefs.get(j).getName().contentEquals(theName))
					{
						team1passd = teamdefs.get(j).getPassYards();
						team1rund = teamdefs.get(j).getRushYards();
						team1pen += teamdefs.get(j).getPenYds();
					}
					
				}
				System.out.println("Enter the Second Team: ");
				String theName2 = sc.next();
				for(int k = 0; k < teams.size(); k++)
				{
					if(teams.get(k).getName().contentEquals(theName2))
					{
						team2name = teams.get(k).getName();
						team2pass = teams.get(k).getPassYards();
						team2run = teams.get(k).getRushYards();
						team2pen = teams.get(k).getPenYds();					}
				}
				for(int l = 0; l < teamdefs.size(); l++)
				{
					if(teamdefs.get(l).getName().contentEquals(theName2))
					{
						team2passd = teamdefs.get(l).getPassYards();
						team2rund = teamdefs.get(l).getRushYards();
						team2pen += teamdefs.get(l).getPenYds();
					}
					
				}
				team1yard = ((team1pass + team2passd)/2) + ((team1run + team2rund)/2) - team1pen;
				team2yard = ((team2pass + team1passd)/2) + ((team2run + team1rund)/2) - team2pen;
				
                double aggregate = 0;
                boolean OneIsHigher = true;
                if(team1yard >= team2yard)
                {
                    aggregate = team1yard/team2yard;
                   
                }
              
                if(team2yard > team1yard)
                {
                    aggregate = team2yard/team1yard;
                    OneIsHigher = false;
                    
                }
                int randomNum = (int)(Math.random() * 1000 + 1);
              
                aggregate = (aggregate/(aggregate + 1));
                
                aggregate *= 1000;
                if(OneIsHigher)
                {
                    if(aggregate > randomNum)
                    System.out.println("Winner: " + team1name);
                    else
                    System.out.println("Winner: " + team2name);   
                }
                else
                {
                    if(aggregate > randomNum)
                        System.out.println("Winner: " + team2name);
                        else
                        System.out.println("Winner: " + team1name);  
                }
                
			    
			}
			else if(choice == 6)
			{
				String team1name = "";
				String team2name = "";
				double team1pass = 0;
				double team1passd = 0;
				double team2pass = 0;
				double team2passd = 0;
				double team1run = 0;
				double team1rund = 0;
				double team2run = 0;
				double team2rund = 0;
				double team1yard = 0;
				double team2yard = 0;
				double team1pen = 0;
				double team2pen = 0;
				double team1turn = 0;
				double team2turn = 0;
				double team1turnd = 0;
				double team2turnd = 0;
				int team1score = 0;
				int team2score = 0;
				System.out.println("Enter the First Team: ");
				String theName = sc.next();
				for(int i = 0; i < teams.size(); i++)
				{
					if(teams.get(i).getName().contentEquals(theName))
					{
						team1name = teams.get(i).getName();
						team1pass = teams.get(i).getPassYards();
						team1run = teams.get(i).getRushYards();
						team1pen = teams.get(i).getPenYds();
						team1turn = teams.get(i).getTurnovers();
					}
				}
				for(int j = 0; j < teamdefs.size(); j++)
				{
					if(teamdefs.get(j).getName().contentEquals(theName))
					{
						team1passd = teamdefs.get(j).getPassYards();
						team1rund = teamdefs.get(j).getRushYards();
						team1pen += teamdefs.get(j).getPenYds();
						team1turnd = teamdefs.get(j).getTurnovers();
					}
					
				}
				System.out.println("Enter the Second Team: ");
				String theName2 = sc.next();
				for(int k = 0; k < teams.size(); k++)
				{
					if(teams.get(k).getName().contentEquals(theName2))
					{
						team2name = teams.get(k).getName();
						team2pass = teams.get(k).getPassYards();
						team2run = teams.get(k).getRushYards();
						team2pen = teams.get(k).getPenYds();					
						team2turn = teams.get(k).getTurnovers();
					}
				}
				for(int l = 0; l < teamdefs.size(); l++)
				{
					if(teamdefs.get(l).getName().contentEquals(theName2))
					{
						team2passd = teamdefs.get(l).getPassYards();
						team2rund = teamdefs.get(l).getRushYards();
						team2pen += teamdefs.get(l).getPenYds();
						team2turnd = teamdefs.get(l).getTurnovers();
					}
					
				}
				team1yard = ((team1pass + team2passd)/2) + ((team1run + team2rund)/2) - team1pen - (35*(team1turn + team2turnd)/2);
				team2yard = ((team2pass + team1passd)/2) + ((team2run + team1rund)/2) - team2pen - (35*(team2turn + team1turnd)/2);
				
				team1score = (int) (team1yard/60);
				team1score *= 7;
				team2score = (int) (team2yard/60);
				team2score *= 7;
				System.out.println(team1name + " " + team1score + "  " + team2name + " " + team2score);
				
			}
	}
}
}