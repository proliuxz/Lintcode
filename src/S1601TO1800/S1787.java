package S1601TO1800;

import Util.OutputCollector;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class Pair {
    private String content;
    private int count;

    Pair(String key, int value) {
        this.content = key;
        this.count = value;
    }

    public String getContent() {
        return this.content;
    }

    public int getCount() {
        return this.count;
    }
}

class Document {
      public int count;
      public String content;
}

public class S1787 {
    public static class Map {
        public void map(Document value,
                        OutputCollector<String, Pair> output) {
            String content = value.content;
            String words = "";
            Pair value_pair = new Pair(content,value.count);
            for(int i = 0;i < content.length();i++){
                words += content.charAt(i);
                output.collect(words,value_pair);
            }
        }
    }

    public static class Reduce {
        private Comparator<Pair> pairComparator = new Comparator<Pair>() {
            public int compare(Pair left, Pair right) {
                if (left.getCount() != right.getCount()) {
                    return left.getCount() - right.getCount();
                }
                return right.getContent().compareTo(left.getContent());
            }
        };
        public void reduce(String key, Iterator<Pair> values, OutputCollector<String, Pair> output) {
            PriorityQueue<Pair> Q = new PriorityQueue<Pair>(pairComparator);
            ArrayList<Pair> list = new ArrayList<Pair>();
            while (values.hasNext()) {
                Q.add(values.next());
                if(Q.size() > 10) Q.poll();
            }
            while(!Q.isEmpty()){
                list.add(Q.poll());
            }
            int n = list.size();
            for(int i = n - 1;i >= 0;i--)
                output.collect(key,list.get(i));
        }
    }
}
