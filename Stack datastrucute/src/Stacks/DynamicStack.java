package Stacks;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            int[] temp = new int[data.length * 2];

            //copy all the items of data to the temp
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            //point the data to temp
            data = temp;
        }
        return super.push(item);
    }
}
