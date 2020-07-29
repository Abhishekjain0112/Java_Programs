/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerEarthChallages;

/**
 *
 * @author Abhishek
 */


import java.util.*;
import java.io.*;

public class ChaituProgram {
    

    static String source, destination;
    static int source_number, destination_number;
    static ArrayList<Integer> final_list = new ArrayList<Integer>();

    static class Edge {

        String src, dest, wt;

        public Edge(String src, String dest, String wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Graph {

        int vertices;
        LinkedList<Edge>[] adjacencyList;

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencyList = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int src, String s, int dest, String d, String w) {
            Edge e = new Edge(s, d, w);
            adjacencyList[src].addFirst(e);
        }

        public void getList() {
            for (int i = 0; i < vertices; i++) {
                LinkedList<Edge> list = adjacencyList[i];
                    
               for(Edge e: list){
               
                   System.out.print( e.src +" " );
                     System.out.print( e.dest + " "  );
                       System.out.println( e.wt  );
               
               }
               
                
                
                if (i == source_number) {                    
                    for (int j = 0; j < list.size(); j++) {
                        if (list.get(j).dest == (destination_number+"")) {                            
                            System.out.print(source+" "+destination+" "+Integer.parseInt(list.get(j).wt));
                        }

                    }
                }

            }
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        source = sc.next();
        destination = sc.next();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList< String> list = new ArrayList< String>();
        String input;
        int count = 0;
        while ((input = br.readLine()) != null && input.length() != 0) {
            list.add(input);
            count++;
        }

        for (String i : list) {
            System.out.println(i);
        }

        int len = list.size();
        ArrayList<String> states = new ArrayList<String>();

        for (int i = 0; i < len; i++) {
            String s = list.get(i);
            int j = 0;
            String wo[] = new String[5];
            for (String w : s.split(" ")) {
                wo[j] = w;
                j++;
            }
            states.add(wo[0]);
            states.add(wo[1]);
        }

        SortedSet<String> new_states = new TreeSet<String>(states);
        int v = new_states.size();

        ArrayList<String> new_list = new ArrayList<String>();

        for (String i : new_states) {
            new_list.add(i);
        }

        source_number = new_list.indexOf(source);
        destination_number = new_list.indexOf(destination);

        Graph g = new Graph(v);
        for (int i = 0; i < states.size() - 2; i += 3) {
            String n = states.get(i);
            String m = states.get(i + 1);
            String we = states.get(i + 2);
            g.addEdge(new_list.indexOf(n), n, new_list.indexOf(m), m, we);
        }
        g.getList();
    }
}
