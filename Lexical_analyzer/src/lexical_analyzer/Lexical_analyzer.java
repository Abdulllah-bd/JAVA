/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexical_analyzer;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Mohammad Abdullah
 */
public class Lexical_analyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("input.txt"));
            

            String[] key = new String[100];
            int keyc = 0;
            String[] iden = new String[100];
            int idenc = 0;
            String[] mop = new String[100];
            int mopc = 0;
            String[] lop = new String[100];
            int lopc = 0;
            String[] num = new String[100];
            int numc = 0;
            String[] ot = new String[100];
            int otc = 0;

            int c = 0;

            while (sc.hasNext()) {
                String st = sc.next();

                //finding math operator                
                if (st.contains("+")) {
                    mop[mopc] = "+";
                    mopc++;
                }
                if (st.contains("-")) {
                    mop[mopc] = "-";
                    mopc++;
                }
                if (st.contains("*")) {
                    mop[mopc] = "*";
                    mopc++;
                }
                if (st.contains("/")) {
                    mop[mopc] = "/";
                    mopc++;
                }
                //finding logical operator
                if (st.contains(">")) {
                    lop[lopc] = ">";
                    lopc++;
                }
                if (st.contains("<")) {
                    lop[lopc] = ">";
                    lopc++;
                }
                if (st.contains(">=")) {
                    lop[lopc] = ">=";
                    lopc++;
                }
                if (st.contains(">=")) {
                    lop[lopc] = ">=";
                    lopc++;
                }
                if (st.contains("==")) {
                    lop[lopc] = "==";
                    lopc++;
                }
                if (st.contains("!=")) {
                    lop[lopc] = "!=";
                    lopc++;
                }
                // other operators
                if (st.contains(",")) {
                    ot[otc] = ",";
                    otc++;
                }
                if (st.contains(";")) {
                    ot[otc] = ";";
                    otc++;
                }
                if (st.contains("(")) {
                    ot[otc] = "(";
                    otc++;
                }
                if (st.contains(")")) {
                    ot[otc] = ")";
                    otc++;
                }
                if (st.contains("{")) {
                    ot[otc] = "{";
                    otc++;
                }
                if (st.contains("}")) {
                    ot[otc] = "}";
                    otc++;
                }

//              finding the keywords    
                if (st.equals("int") || st.equals("float") || st.equals("double") || st.equals("String") || st.equals("char")) {
                    key[keyc] = st;
                    keyc++;
                    c++;
                }
                
                if (st.equals("if") || st.equals("else")) {
                    key[keyc] = st;
                    keyc++;
                }
                

                if ( c>=1 && !st.contains(";")) {
                    if(c!=1){
                    StringTokenizer stst = new StringTokenizer(st, ",");
                    iden[idenc] = stst.nextToken();
                    idenc++;
                    }
                    c++;
                } else if(c>=1 && st.contains(";")) {
                    StringTokenizer stst = new StringTokenizer(st, ";");
                    iden[idenc] = stst.nextToken();
                    idenc++;
                    c = 0;
                }

                StringTokenizer stst = new StringTokenizer(st, ",;");
                while (stst.hasMoreTokens()) {
                    try {
                        double d = Double.parseDouble(stst.nextToken());
                        num[numc] = Double.toString(d);
                        numc++;
                    } catch (NumberFormatException nfe) {

                    }
                }

            }
            PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
            
            //print keywords
            writer.print("Keyword: "+key[0]);
            for(int a=1;a<keyc;a++){
                writer.print(","+key[a]);
            }
            writer.println("");
            
            
            //print Identifier
            writer.print("identifier: "+iden[0]);
            for(int a=1;a<idenc;a++){
                writer.print(","+iden[a]);
            }
            writer.println("");
            
            //print math
            String print="Math operator: "+mop[0];
            for(int a=1;a<mopc;a++){
                if(!print.contains(mop[a]))
                print=print+","+mop[a];
            }
            writer.println(print);
            
            //print math
            print="Logical operator: "+lop[0];
            for(int a=1;a<lopc;a++){
                if(!print.contains(lop[a]))
                print=print+","+lop[a];
            }
            writer.println(print);
            
            //print numeric
            print="Numeric values: "+num[0];
            for(int a=1;a<numc;a++){
                
                print=print+","+num[a];
            }
            writer.println(print);
            
            //print others
            print="Others: "+ot[0];
            for(int a=1;a<otc;a++){
                if(!print.contains(ot[a]))
                print=print+" "+ot[a];
            }
            writer.println(print);
            
            
            
            
            
            
            writer.close();
        } catch (Exception E) {
            System.err.println("ERROR" + E);
        }
    }

}
