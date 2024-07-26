class FreshJuice{
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}

class FreshJuiceTest {
    public static void main(String[] args){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println("Размер:"+juice.size);
        if (juice.size == FreshJuice.FreshJuiceSize.LARGE){
            System.out.println("Вам немного будет?");
        }
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        for (int j = 1; j<=10; j++){
            System.out.print(j+ "  ");
        }
    }
}
