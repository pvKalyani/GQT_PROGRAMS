package demo;

import java.util.Scanner;
public class Quiz {
	        static final String RESET  = "\u001B[0m";
		    static final String GREEN  = "\u001B[32m";
		    static final String RED    = "\u001B[31m";
		    static final String BLUE   = "\u001B[34m";
		    static final String PURPLE = "\u001B[35m";
		    static final String YELLOW = "\u001B[33m";
		    static final String BRIGHT_YELLOW = "\u001B[93m";
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter Your Name :  "); 
		        String name = sc.next();
		        System.out.println("Welcome "+name+" To the Game ");
		        int score = 0;
		        boolean audiencePoll_Used = false;
		        boolean fifty_fifty_Used = false;
		        int ans;
		        System.out.println(YELLOW+"******************* ALL THE BEST FOR THE GAME  ******************"+RESET);
		        System.out.println("-------------------------------------------------------");
		        System.out.println("QUESTION 1 : "); 
		        System.out.println("\nQ1: What is the size of an int data type in Java?");
		        System.out.println("1. 8 bits");
		        System.out.println("2. 16 bits");
		        System.out.println("3. 32 bits");
		        System.out.println("4. 64 bits");
		        System.out.println("5. Lifeline");
		        ans = sc.nextInt();
		        if (ans == 5) {
		            if ( !audiencePoll_Used && !fifty_fifty_Used ) {
		                System.out.println("\n1. Audience Poll  2. 50-50");
		                ans = sc.nextInt();
		                if (ans == 1) {
		                	audiencePoll_Used = true;
		                    System.out.println(BLUE + "Audience Poll:" + RESET);
		                    System.out.println("1:10%  2:20%  3:70%  4:30%");
		                } else if (ans == 2) {
		                	fifty_fifty_Used  = true;
		                    System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                    System.out.println("3. 32");
		                    System.out.println("4. 64");
		                }
		            } else if (!audiencePoll_Used) {
		            	    audiencePoll_Used = true;
		                System.out.println(BLUE + "Audience Poll:" + RESET);
		                System.out.println("1:10%  2:70%  3:10%  4:10%");
		            } else if (!fifty_fifty_Used ) {
		            	    fifty_fifty_Used = true;
		                System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                System.out.println("3. 32");
		                System.out.println("4. 64");
		            } 
		            else {
		                System.out.println(BLUE +  "lifelines Already Used. Please select Options 1-4" + RESET);
		            }
		            ans = sc.nextInt();
		        }
		        if (ans != 3) {
		            System.out.println(RED + "Wrong Answer! You won ₹" + score + RESET);
		            System.out.println("Your Game is Completed");
		            return;
		        }
		        score = score+10;
		        System.out.println(GREEN + "Correct Answer "+ name +RESET );
		        System.out.println(BRIGHT_YELLOW+"Your Score is : " + score + RESET);
		        System.out.println("-------------------------------------------------------");
		        System.out.println("QUESTION 2 : "); 
		        System.out.println("\nQ2: Which symbol is used to end a statement in Java?");
		        System.out.println("1. ;");
		        System.out.println("2. ,");
		        System.out.println("3. /");
		        System.out.println("4. #");
		        System.out.println("5. Lifeline");
		        ans = sc.nextInt();
		        if (ans == 5) {
		            if (!audiencePoll_Used && !fifty_fifty_Used ) {
		                System.out.println("\n1. Audience Poll  2. 50-50");
		                ans = sc.nextInt();
		                if (ans == 1) {
		                	audiencePoll_Used = true;
		                    System.out.println(BLUE + "Audience Poll:" + RESET);
		                    System.out.println("1:95%  2:45%  3:25%  4:5%");
		                } else if (ans == 2) {
		                	fifty_fifty_Used  = true;
		                    System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                    System.out.println("1. ;");
		                    System.out.println("2. ,");
		                }
		            } else if (!audiencePoll_Used) {
		            	audiencePoll_Used = true;
		                System.out.println(BLUE + "Audience Poll:" + RESET);
		                System.out.println("1:95%  2:45%  3:25%  4:5%");
		            } else if (!fifty_fifty_Used ) {
		            	fifty_fifty_Used  = true;
		                System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                System.out.println("1. ;");
		                System.out.println("2. ,");
		            } else {
		                System.out.println(BLUE +  "lifelines Already Used. Please select Options 1-4"  + RESET);
		            }
		            ans = sc.nextInt();
		        }

		        if (ans != 1) {
		            System.out.println(RED + "Wrong Answer! Your Score is : " + score + RESET);
		            System.out.println("Your Game is Completed");   
		            return;
		        }
		        score = score+200;
		        System.out.println(GREEN + "Correct Answer "+ name +RESET );
		        System.out.println(PURPLE+"Your Score is : " + score + RESET);
		        System.out.println("-------------------------------------------------------");
		        System.out.println("QUESTION 3 : "); 
		        System.out.println("\nQ3: Keyword to create object?");
		        System.out.println("1. class");
		        System.out.println("2. object");
		        System.out.println("3. new");
		        System.out.println("4. create");
		        System.out.println("5. Lifeline");
		        ans = sc.nextInt();
		        if (ans == 5) {
		            if (!audiencePoll_Used && !fifty_fifty_Used ) {
		                System.out.println("\n1. Audience Poll  2. 50-50");
		                ans = sc.nextInt();
		                if (ans == 1) {
		                	audiencePoll_Used = true;
		                    System.out.println(BLUE + "Audience Poll:" + RESET);
		                    System.out.println("1:5%  2:15%  3:80%  4:10%");
		                } else if (ans == 2) {
		                	fifty_fifty_Used = true;
		                    System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                    System.out.println("2. object");
		                    System.out.println("3. new");
		                }
		            } else if (!audiencePoll_Used) {
		            	audiencePoll_Used = true;
		                System.out.println(BLUE + "Audience Poll:" + RESET);
		                System.out.println("1:5%  2:15%  3:80%  4:10%");
		            } else if (!fifty_fifty_Used ) {
		            	fifty_fifty_Used  = true;
		                System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                System.out.println("2. object");
		                System.out.println("3. new");
		            } else {
		                System.out.println(BLUE +  "lifelines Already Used. Please select Options 1-4"  + RESET);
		            }
		            ans = sc.nextInt();
		        }

		        if (ans != 3) {
		            System.out.println(RED + "Wrong Answer! Your Score is : " + score + RESET);
		            System.out.println("Your Game is Completed");		            
		            return;
		        }
		        score = score+300;
		        System.out.println(GREEN + "Correct Answer "+ name +RESET );
		        System.out.println(PURPLE+"Your Score is : " + score + RESET);
		        System.out.println("-------------------------------------------------------");
		        System.out.println("QUESTION 4 : "); 
		        System.out.println("\nQ4: Which of the following is a 1-D array declaration?");
		        System.out.println("1. int a;");
		        System.out.println("2. int a[][];");
		        System.out.println("3. int[] a;");
		        System.out.println("4. array int a;");
		        System.out.println("5. Lifeline");
		        ans = sc.nextInt();
		        if (ans == 5) {
		            if (!audiencePoll_Used && !fifty_fifty_Used ) {
		                System.out.println("\n1. Audience Poll  2. 50-50");
		                ans = sc.nextInt();
		                if (ans == 1) {
		                	audiencePoll_Used = true;
		                    System.out.println(BLUE + "Audience Poll:" + RESET);
		                    System.out.println("1:25%  2:10%  3:95%  4:30%");
		                } else if (ans == 2) {
		                	fifty_fifty_Used = true;
		                    System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                    System.out.println("1. int a;");
		                    System.out.println("3. int[] a;");
		                }
		            } else if (!audiencePoll_Used) {
		            	audiencePoll_Used = true;
		                System.out.println(BLUE + "Audience Poll:" + RESET);
		                System.out.println("1:25%  2:10%  3:95%  4:30%");
		            } else if (!fifty_fifty_Used ) {
		            	fifty_fifty_Used  = true;
		                System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                System.out.println("1. int a;");
		                System.out.println("3. int[] a;");
		            } else {
		                System.out.println(BLUE +  "lifelines Already Used. Please select Options 1-4" + RESET);
		            }
		            ans = sc.nextInt();
		        }

		        if (ans != 3) {
		            System.out.println(RED + "Wrong Answer! Your Score is : " + score + RESET);
		            System.out.println("Your Game is Completed");
		            
		            return;
		        }
		        score = score+400;
		        System.out.println(GREEN + "Correct Answer "+ name +RESET );
		        System.out.println(PURPLE+"Your Score is : " + score + RESET);
		        System.out.println("-------------------------------------------------------");
		        System.out.println("QUESTION 5 : "); 
		        System.out.println("\nQ5: What is the default value of an instance variable in Java?");
		        System.out.println("1. garbage value");
		        System.out.println("2. zero");
		        System.out.println("3. null");
		        System.out.println("4. depends on data type");
		        System.out.println("5. Lifeline");
		        ans = sc.nextInt();
		        if (ans == 5) {
		            if (!audiencePoll_Used && !fifty_fifty_Used ) {
		                System.out.println("\n1. Audience Poll  2. 50-50");
		                ans = sc.nextInt();
		                if (ans == 1) {
		                	audiencePoll_Used = true;
		                    System.out.println(BLUE + "Audience Poll:" + RESET);
		                    System.out.println("1:10%  2:90%  3:20%  4:30%");
		                } else if (ans == 2) {
		                	fifty_fifty_Used  = true;
		                    System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                    System.out.println("2. 90%");
		                    System.out.println("4. 30%");
		                }
		            } else if (!audiencePoll_Used) {
		            	audiencePoll_Used = true;
		                System.out.println(BLUE + "Audience Poll:" + RESET);
		                System.out.println("1:10%  2:90%  3:20%  4:30%");
		            } else if (!fifty_fifty_Used ) {
		            	fifty_fifty_Used  = true;
		                System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                System.out.println("2. 90%");
		                System.out.println("4. 30%");
		            } else {
		                System.out.println(BLUE +  "lifelines Already Used. Please select Options 1-4" + RESET);
		            }
		            ans = sc.nextInt();
		        }
		        if (ans != 2) {
		            System.out.println(RED + "Wrong Answer! Your Score is : " + score + RESET);
		            System.out.println("Your Game is Completed");            
		            return;
		        }
		        score = score+500;
		        System.out.println(GREEN + "Correct Answer "+ name +RESET );
		        System.out.println(PURPLE+"Your Score is : " + score + RESET);
		        System.out.println("-------------------------------------------------------");
		        System.out.println("QUESTION 6 : "); 
		        System.out.println("\nQ6: Which of the following is not a Java data type?");
		        System.out.println("1. int");
		        System.out.println("2. float");
		        System.out.println("3. boolean");
		        System.out.println("4. real");
		        System.out.println("5. Lifeline");
		        ans = sc.nextInt();
		        if (ans == 5) {
		            if (!audiencePoll_Used && !fifty_fifty_Used ) {
		                System.out.println("\n1. Audience Poll  2. 50-50");
		                ans = sc.nextInt();
		                if (ans == 1) {
		                	audiencePoll_Used = true;
		                    System.out.println(BLUE + "Audience Poll:" + RESET);
		                    System.out.println("1:15%  2:10%  3:65%  4:90%");
		                } else if (ans == 2) {
		                	fifty_fifty_Used = true;
		                    System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                    System.out.println("1. int");
		                    System.out.println("4. real");
		                }
		            } else if (!audiencePoll_Used) {
		            	audiencePoll_Used = true;
		                System.out.println(BLUE + "Audience Poll:" + RESET);
		                System.out.println("1:15%  2:10%  3:65%  4:90%");
		            } else if (!fifty_fifty_Used ) {
		            	fifty_fifty_Used = true;
		                System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                System.out.println("1. int");
		                System.out.println("4. real");
		            } else {
		                System.out.println(BLUE +  "lifelines Already Used. Please select Options 1-4"  + RESET);
		            }
		            ans = sc.nextInt();
		        }

		        if (ans != 4) {
		            System.out.println(RED + "Wrong Answer! Your Score is : " + score + RESET);
		            System.out.println("Your Game is Completed");		            
		            return;
		        }
		        score = score+600;
		        System.out.println(GREEN + "Correct Answer "+ name +RESET );
		        System.out.println(PURPLE+"Your Score is : " + score + RESET);
		        System.out.println("-------------------------------------------------------");
		        System.out.println("QUESTION 7 : "); 
		        System.out.println("\nQ7: Java does not supports which inheritance?");
		        System.out.println("1. single");
		        System.out.println("2. multiple");
		        System.out.println("3. multilevel");
		        System.out.println("4. hierarchical");
		        System.out.println("5. Lifeline");
		        ans = sc.nextInt();
		        if (ans == 5) {
		            if (!audiencePoll_Used && !fifty_fifty_Used ) {
		                System.out.println("\n1. Audience Poll  2. 50-50");
		                ans = sc.nextInt();
		                if (ans == 1) {
		                	audiencePoll_Used = true;
		                    System.out.println(BLUE + "Audience Poll:" + RESET);
		                    System.out.println("1:15%  2:5%  3:90%  4:10%");
		                } else if (ans == 2) {
		                	fifty_fifty_Used  = true;
		                    System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                    System.out.println("2. multiple");
		                    System.out.println("3. multilevel");
		                }
		            } else if (!audiencePoll_Used) {
		            	audiencePoll_Used = true;
		                System.out.println(BLUE + "Audience Poll:" + RESET);
		                System.out.println("1:15%  2:5%  3:90%  4:10%");
		            } else if (!fifty_fifty_Used ) {
		            	fifty_fifty_Used = true;
		                System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                System.out.println("2. multiple");
		                System.out.println("3. multilevel");
		            } else {
		                System.out.println(BLUE +  "lifelines Already Used. Please select Options 1-4" + RESET);
		            }
		            ans = sc.nextInt();
		        }

		        if (ans != 3) {
		            System.out.println(RED + "Wrong Answer! Your Score is : " + score + RESET);
		            System.out.println("Your Game is Completed");
		            return;
		        }
		        score = score+700;
		        System.out.println(GREEN + "Correct Answer "+ name +RESET );
		        System.out.println(PURPLE+"Your Score is : " + score + RESET);
		        System.out.println("-------------------------------------------------------");
		        System.out.println("QUESTION 8 : "); 
		        System.out.println("\nQ8: Keyword for exception handling?");
		        System.out.println("1. try");
		        System.out.println("2. throw");
		        System.out.println("3. catch");
		        System.out.println("4. finally");
		        System.out.println("5. Lifeline");
		        ans = sc.nextInt();
		        if (ans == 5) {
		            if (!audiencePoll_Used && !fifty_fifty_Used ) {
		                System.out.println("\n1. Audience Poll  2. 50-50");
		                ans = sc.nextInt();
		                if (ans == 1) {
		                	audiencePoll_Used = true;
		                    System.out.println(BLUE + "Audience Poll:" + RESET);
		                    System.out.println("1:70%  2:10%  3:10%  4:10%");
		                } else if (ans == 2) {
		                	fifty_fifty_Used = true;
		                    System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                    System.out.println("1. try");
		                    System.out.println("2. throw");
		                }
		            } else if (!audiencePoll_Used) {
		            	audiencePoll_Used = true;
		                System.out.println(BLUE + "Audience Poll:" + RESET);
		                System.out.println("1:70%  2:10%  3:10%  4:10%");
		            } else if (!fifty_fifty_Used ) {
		            	fifty_fifty_Used  = true;
		                System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                System.out.println("1. try");
		                System.out.println("2. throw");
		            } else {
		                System.out.println(BLUE+  "lifelines Already Used. Please select Options 1-4" + RESET);
		            }
		            ans = sc.nextInt();
		        }

		        if (ans != 1) {
		            System.out.println(RED + "Wrong Answer! Your Score is : " + score + RESET);
		            System.out.println("Your Game is Completed");
		            return;
		        }
		        score = score+800;
		        System.out.println(GREEN + "Correct Answer "+ name +RESET );
		        System.out.println(PURPLE+"Your Score is : " + score + RESET);
		        System.out.println("-------------------------------------------------------");
		        System.out.println("QUESTION 9 : "); 
		        System.out.println("\nQ9: Which is an output statement?");
		        System.out.println("1. System.in");
		        System.out.println("2. System.read");
		        System.out.println("3. System.out.println");
		        System.out.println("4. Scanner");
		        System.out.println("5. Lifeline");
		        ans = sc.nextInt();
		        if (ans == 5) {
		            if (!audiencePoll_Used && !fifty_fifty_Used ) {
		                System.out.println("\n1. Audience Poll  2. 50-50");
		                ans = sc.nextInt();
		                if (ans == 1) {
		                	audiencePoll_Used = true;
		                    System.out.println(BLUE + "Audience Poll:" + RESET);
		                    System.out.println("1:80%  2:5%  3:95%  4:10%");
		                } else if (ans == 2) {
		                	fifty_fifty_Used = true;
		                    System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                    System.out.println("1. System.in");
		                    System.out.println("3. System.out.println");
		                }
		            } else if (!audiencePoll_Used) {
		            	audiencePoll_Used= true;
		                System.out.println(BLUE + "Audience Poll:" + RESET);
		                System.out.println("1:80%  2:5%  3:95%  4:10%");
		            } else if (!fifty_fifty_Used ) {
		            	fifty_fifty_Used  = true;
		                System.out.println(BLUE + "50-50 Lifeline:" + RESET);
		                System.out.println("1. System.in");
		                System.out.println("3. System.out.println");
		            } else {
		                System.out.println(BLUE + "lifelines Already Used. Please select Options 1-4" + RESET);
		            }
		            ans = sc.nextInt();
		        }
		        if (ans != 3) {
		            System.out.println(RED + "Wrong Answer! Your Score is : "  + score + RESET);
		            System.out.println("Your Game is Completed");
		            return;
		        }
		        score = score+900;
		        System.out.println(GREEN + "Correct Answer "+ name +RESET );
		        System.out.println(YELLOW+"Your Score is : " + score + RESET);
                System.out.println("-------------------------------------------------------");
		        System.out.println("QUESTION 10 : "); 
		        System.out.println("\nQ10 : Keyword for inheritance?");
		        System.out.println("1. implement");
		        System.out.println("2. inherit");
		        System.out.println("3. extends");
		        System.out.println("4. super");
		        ans = sc.nextInt();
		        if (ans != 3) {
		            System.out.println(RED + "Wrong Answer! Your Score is : " + score + RESET);	            
		            return;
		        }
		        score = score+1000;
		        System.out.println(YELLOW+ "CONGRATULATIONS  "+name + RESET);
		        System.out.println(BRIGHT_YELLOW+ " Your Game is Completed"+RESET);
		        System.out.println(YELLOW + "You Total Score is :" + score + RESET);        
		    }
		    }
