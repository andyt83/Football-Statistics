
public class SpecialTeams {
	private String name;
	private double xpp;
	private double fgp;
	private double puntavg;
	private double tchbkpct;
	private double kickavg;
	private double oobpct;
	private double kickretavg;
	private double kickrettdrate;
	private double oppkickretavg;
	private double punttchbckpct;
	private double puntretavg;
	private double puntrettdrate;
	
	public SpecialTeams(String n, double x, double f, double p, double t, double k, double o, double ki, double kr, double op, double pu, double pa, double pr)
	{
		name = n;
		xpp = x;
		fgp = f;
		puntavg = p;
		tchbkpct = t;
		kickavg = k;
		oobpct = o;
		kickretavg = ki;
		kickrettdrate = kr;
		oppkickretavg = op;
		punttchbckpct = pu;
		puntretavg = pa;
		puntrettdrate = pr;
		
	}
	public SpecialTeams()
	{
		name = "";
		xpp = 0;
		fgp = 0;
		puntavg = 0;
		tchbkpct = 0;
		kickavg = 0;
		oobpct = 0;
		kickretavg = 0;
		kickrettdrate = 0;
		oppkickretavg = 0;
		punttchbckpct = 0;
		puntretavg = 0;
		puntrettdrate = 0;
	}
	
	public String getName()
	{
		return name;
	}
	public double getXpp()
	{
		return xpp;
	}
	public double getFgp()
	{
		return fgp;
	}
	public double getPuntAvg()
	{
		return puntavg;
	}
	public double getTchbkPct()
	{
		return tchbkpct;
	}
	public double getKickAvg()
	{
		return kickavg;
	}
	public double getOobPct()
	{
		return oobpct;
	}
	public double getKickRetAvg()
	{
		return kickretavg;
	}
	public double getKickRetTdRate()
	{
		return kickrettdrate;
	}
	public double getOppKickRetAvg()
	{
		return oppkickretavg;
	}
	public double getPuntTchbckpct()
	{
		return punttchbckpct;
	}
	public double getPuntRetAvg()
	{
		return puntretavg;
	}
	public double getPuntRetTdRate()
	{
		return puntrettdrate;
	}
	public void setTchbkPct(Double t)
	{
		tchbkpct = t;
	}
	public void setKickAvg(Double kick)
	{
		kickavg = kick;
	}
	public void setOobPct(Double oob){
		oobpct = oob;
	}
	public void setKickRetAvg(Double kickret)
	{
		kickretavg = kickret;
	}
	public void setKickRetTdRate(Double kickrettd)
	{
		kickrettdrate = kickrettd;
	}
	public void setOppKickRetAvg(Double oppkickret)
	{
		kickrettdrate = oppkickret;
	}
	public void setPuntRetAvg(Double puntretavg1)
	{
		puntretavg = puntretavg1;
	}
	public void setPuntRetTdRate(Double puntrettdra)
	{
		kickrettdrate = puntrettdra;
	}
}
