/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

/**
 *
 * @author Bharat
 */
public class pbn3 {

    static boolean _findGroup(String[] friends, int group, int[] frndGroup, int personNum) {

        if (frndGroup[personNum] != 0) {
            return false;
        }

//        // assign group to this friend
//        frndGroup[personNum] = grpCnt;
//
//        // check for each friend
//        for (int p = 0; p < friends.length; ++p) {
//            if (p != personNum && friends[personNum][p] == 'Y') {
//                _findGroup(friends, group, frndGroup, personNum);
//            }
//        }

        return true;
    }

    static int friendCircles(String[] friends) {

        int[] frndGroup = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
            frndGroup[i] = 0;
        }

        int group = 1;

        for (int personNum = 0; personNum < friends.length; ++personNum) {
            if (_findGroup(friends, group, frndGroup, personNum)) {
                ++group;
            }
        }
        return group - 1;

    }

}
