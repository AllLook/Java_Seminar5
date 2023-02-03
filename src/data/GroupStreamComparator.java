package data;

import java.util.Comparator;
import java.lang.Comparable;

public class GroupStreamComparator implements Comparator<GroupStream> { // класс для сравнения потоков
    //GroupStream groupStream = new GroupStream();

    @Override
    public int compare(GroupStream groupStream1, GroupStream groupStream2) { // переназначение метода сравнения для размера групп
        int groupSize1 = groupStream1.getGroupStudent().size();
        int groupSize2 = groupStream2.getGroupStudent1().size();
        return Integer.compare(groupSize1,groupSize2);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}







