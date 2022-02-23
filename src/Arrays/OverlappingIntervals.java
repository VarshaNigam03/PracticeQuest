package Arrays;


import java.util.*;

public class OverlappingIntervals {

    public static ArrayList<Interval> overlapIntervals(ArrayList<Interval> intervals){
        ArrayList<Interval> al = new ArrayList<Interval>();

        Collections.sort(intervals, (a,b) -> Integer.compare(a.start, b.start));
        Interval temp = intervals.get(0);
        int start = temp.start;
        int end = temp.end;

        for(int i=1; i<intervals.size(); i++){
            temp = intervals.get(i);
            if(temp.start <= end){
                end = Math.max(end, temp.end);
            }
            else{
                al.add(new Interval(start,end));
                start = temp.start;
                end =temp.end;
            }
        }
        al.add(new Interval(start,end));
        return al;
    }

    public static void mergeIntervals(Interval arr[]){
        if (arr.length <= 0)
            return;
        Stack<Interval> stack=new Stack<>();
        Arrays.sort(arr,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.start-i2.start;
            }
        });
        stack.push(arr[0]);
        for (int i = 1 ; i < arr.length; i++)
        {
            Interval top = stack.peek();
            if (top.end < arr[i].start)
                stack.push(arr[i]);
            else if (top.end < arr[i].end)
            {
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }
        System.out.print("The Merged Intervals are: ");
        while (!stack.isEmpty())
        {
            Interval t = stack.pop();
            System.out.print("["+t.start+","+t.end+"] ");
        }
    }

    public static void main(String []args){
//        ArrayList<Interval> input = new ArrayList<Interval>();
//        input.add(new Interval(1, 4));
//        input.add(new Interval(2, 5));
//        input.add(new Interval(6, 9));
//        ArrayList<Interval> output = overlapIntervals(input);
//        for(Interval result : output) {
//            System.out.println(result.start + " " + result.end);
//        }
//
        Interval arr[]=new Interval[4];
        arr[0]=new Interval(6,8);
        arr[1]=new Interval(1,2);
        arr[2]=new Interval(3,4);
        arr[3]=new Interval(4,7);
        mergeIntervals(arr);
    }

}
    class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }



