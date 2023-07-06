package 백준.실버;

import java.io.*;
import java.util.*;

public class bj8979 {

    static class Nation implements Comparable<Nation> {
        int num, gold, silver, bronze;

        public Nation(int num, int gold, int silver, int bronze) {
            this.num = num;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public int compareTo(Nation o) {
            if (this.gold == o.gold) {
                if (this.silver == o.silver) {
                    return o.bronze - this.bronze;
                }
                else return o.silver - this.silver;
            }
            else
                return o.gold - this.gold;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int countryCount = Integer.parseInt(st.nextToken());
        int countryIndex = Integer.parseInt(st.nextToken());

        ArrayList<Nation> list = new ArrayList<>();

        for (int i = 0; i < countryCount; i++) {
            StringTokenizer tmp = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(tmp.nextToken());
            int gold = Integer.parseInt(tmp.nextToken());
            int silver = Integer.parseInt(tmp.nextToken());
            int bronze = Integer.parseInt(tmp.nextToken());

            Nation nation = new Nation(num, gold, silver, bronze);
            list.add(nation);
        }

        Collections.sort(list);

        int rate = 1;
        int cnt = 1;

        if (list.get(0).num == countryIndex) {
            bw.write("1\n");
            bw.flush();
            bw.close();
            return;
        }

        for (int i = 1; i < countryCount; i++) {

            Nation prev = list.get(i-1);
            Nation cur = list.get(i);

            if ((prev.gold != cur.gold) || (prev.silver != cur.silver) || (prev.bronze != cur.bronze)) {
                rate += cnt;
                cnt = 1;
            }
            else
                cnt++;

            if (cur.num == countryIndex) {
                bw.write(rate + "\n");
                break;
            }
        }
        bw.flush();
        bw.close();
    }

}
