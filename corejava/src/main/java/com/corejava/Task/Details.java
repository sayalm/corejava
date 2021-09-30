package com.corejava.Task;

    public class Details {
        // Access modifier ??
        // Indent
            String Name;

            String email;
            int number;
            String Title;
            String Institution;

        public Details(String n, String a, String e, int num, String t) {
            Name = n;

            email = e;
            number = num;
            Title = t;
        }

            void displayInformation() {
       //         System.out.println(Name + " " + address + " " + email + "" + number + " " + Title);

            }


            public static void main(String[] args) {

//                Author dtl1 = new Author();
//                dtl1.Author("Sayal", "Bkt", "123@.com", 1, "katha");
                Details dtl1 = new Details("Sayal", "Bkt", "123@.com", 1, "katha");
                dtl1.displayInformation();


            }


        }