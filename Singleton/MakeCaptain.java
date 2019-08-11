package Singleton;

class MakeCaptain {
    private static MakeCaptain _captain;

    //Make constructor private
    private MakeCaptain(){}
    
    public static MakeCaptain getCaptain(){
        //Lazy initialization
        if(_captain == null){
            _captain = new MakeCaptain();
            System.out.println("New captain is selected for our team.");
        } else {
            System.out.println("You already have captain for your team.");
            System.out.println("Send him for toss.");
        }
        return _captain;
    }
}

class SingletonPatternMain{
    public static void main(String[] args) {
        System.out.println("Singleton pattern demo.");
        System.out.println("Trying to make a captain for our team");
        MakeCaptain c1 = MakeCaptain.getCaptain();
        System.out.println("Trying to make another captain.");
        MakeCaptain c2 = MakeCaptain.getCaptain();
        if(c1 == c2){
            System.out.println("c1 & c2 are same instance.");
        }
    }
}