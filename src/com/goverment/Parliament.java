package com.goverment;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by MATQ on 2016-12-19.
 */
public class Parliament {
    private int cadency;
    private double sum_spendings_all_members=0;
    private int amount_of_members=0;
    public static List<MemberOfParliament> List_OfMembers = new LinkedList<>();

    public Parliament(){
        sum_spendings_all_members=0;
        amount_of_members=0;
    }

    public void SetCadencyOfParliament (int cadency){
        this.cadency = cadency;
    }

    public int GetCadencyOfParliament(){
        return this.cadency;
    }

    public void AddSumSpendings(double spendings_of_member){
        this.sum_spendings_all_members += spendings_of_member;
    }

    public void SetAmountOfMembers(int amount_of_members){
        this.amount_of_members= amount_of_members;
    }

    public void Add1ToAmountOfMembers (){
        this.amount_of_members++;
    }

    public void SetMemberOfParliament_ADD(MemberOfParliament member){
        this.List_OfMembers.add(member);
    }

    public MemberOfParliament GetMemberOfParliament_AT (int position){
        return this.List_OfMembers.get(position);
    }

    public List<MemberOfParliament> GetListMemberOfParliament (){
        return this.List_OfMembers;
    }

    public double AvrSumSpendings (){
        return sum_spendings_all_members/((double)amount_of_members);
    }


}
