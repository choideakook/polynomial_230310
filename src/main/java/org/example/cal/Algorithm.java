package org.example.cal;

import java.util.*;

public class Algorithm {

    public int[] run(String[] id_list, String[] report, int k) {
        Map<String, Member> store = new HashMap<>();
        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            Member member = new Member();
            member.setId(i);
            member.setWarn(0);
            store.put(id_list[i], member);
        }

        for (String s : report) {
            String[] warn = s.split(" ");
            Member member = store.get(warn[0]);

            if (!member.getReports().contains(warn[1])) {
                member.setWarn(member.getWarn() + 1);
                member.getReports().add(warn[1]);

                if (member.getWarn() >= k) member.setExile(true);
            }
        }

        for (Member member : store.values()) {

        }
        return null;
    }
}
class Member{
    private int id, warn;
    private boolean exile = false;
    private List<String> reports = new ArrayList<>();

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public int getWarn() {return warn;}
    public void setWarn(int warn) {this.warn = warn;}
    public boolean isExile() {return exile;}
    public void setExile(boolean exile) {this.exile = exile;}
    public List<String> getReports() {return reports;}
}