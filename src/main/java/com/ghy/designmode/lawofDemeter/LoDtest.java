package com.ghy.designmode.lawofDemeter;



public class LoDtest {
    public static void main(String[] args)
    {
        Agent agent=new Agent();
        agent.setStar(new Star("林心如"));
        agent.setFans(new Fans("粉丝"));
        agent.setCompany(new Company("中国传媒有限公司"));
        agent.meeting();
        agent.business();
    }
}
