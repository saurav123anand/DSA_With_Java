public class Main {
    public static void main(String[] args) throws StackException {
//        CustomStack customStack=new CustomStack(5);
//        customStack.push(56);
//        customStack.push(78);
//        customStack.push(23);
//        System.out.println(customStack.pop());

        CustomStack dynamicStack=new DynamicStack(2);
        dynamicStack.push(56);
        dynamicStack.push(78);
        dynamicStack.push(23);
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
    }
}
