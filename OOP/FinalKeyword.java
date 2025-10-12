class FinalKeyword{

    //final keyword can be used with attributes, and method, and it means that that attribute can not be reassigned with 
    //another value, and that method can not overriden, it is like you set them to constants , their initial content/value
    // is what they stay on

    final  int x = 50; // like you set the attribute x to const in js
    public int y = 20; //this can be accessed and get changed

    public static void main(String[] args){
        FinalKeyword obj  = new FinalKeyword();
        obj.x = 15; // this will cause an error , that the x variable cannot be changed because it hase the keyword final
        obj.y =111; // this will change variable/attribute y to 111 normally

        System.out.println(obj.y);
    }
}