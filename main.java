public class SixThirty {
    public static void main(String[] args) {
        int firstrole = (int)rollDie();
        int secondrole = (int)rollDie();
        int yourpoint = addNums(firstrole, secondrole);
        
        System.out.println("You rolled " + firstrole + " + " + secondrole + " = " + yourpoint);
        
        switch (yourpoint) {
            case 7:
            case 11:
                System.out.println("You win!");
                break;
            case 2:
            case 3:
            case 12:
                System.out.println("You lose!");
                break;
            default:
                int firstroll = (int)rollDie();
                int secondroll = (int)rollDie();
                int newyourpoint = addNums(firstroll, secondroll);
                System.out.println("You rolled " + firstroll + " + " + secondroll + " = " + newyourpoint);
                if(yourpoint == newyourpoint){
                    System.out.println("You win!");
                }
                else if (newyourpoint == 7){
                    System.out.println("You lose!");
                }
                else if(newyourpoint != yourpoint && newyourpoint != 7){
                    while(newyourpoint != yourpoint && newyourpoint !=7){
                        firstroll = (int)rollDie();
                        secondroll = (int)rollDie();
                        newyourpoint = addNums(firstroll, secondroll);
                        System.out.println("You rolled " + firstroll + " + " + secondroll + " = " + newyourpoint);
                }
                    if(newyourpoint == yourpoint) {
                        System.out.println("You win!");
                    }
                    else{
                        System.out.println("You lose!");
                    }
                    break;
        }
    }}
    public static double rollDie(){
        return (Math.random()* 6 +1);
    }
    public static int addNums(int a, int b){
        return a + b;
    }
}
