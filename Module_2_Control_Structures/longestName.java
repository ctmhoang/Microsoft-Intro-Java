public static void longestName(Scanner console, int num){
    String longestName ="";
    String returnName;
    int counter = 0;
    for (int i = 1; i <= num; i++){
        System.out.print("name #" + i+ "? ");
        String tempName = console.next();
        if (tempName.length() > longestName.length() ){
            counter = 0;
            longestName = tempName;
        }
        else if (tempName.length() == longestName.length()){
            counter += 1;
        }
    }
    returnName = Character.toUpperCase(longestName.charAt(0)) + (longestName.substring(1)).toLowerCase();
    System.out.println(returnName +"'s name is longest");
    if (counter != 0){
        System.out.println("(There was a tie!)");
}
}
