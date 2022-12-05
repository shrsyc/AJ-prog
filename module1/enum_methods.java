enum color{RED,WHITE,BLUE,GREEN,YELLOW}
class colors{
    public static void main(String[] args) {
        color a=color.BLUE;
        System.out.println(color.valueOf("BLUE"));
        for(color c:color.values()){
            System.out.println(c+" ordinal value is "+c.ordinal());
            if(c.compareTo(a)<0)System.out.println(c+" comes before "+a);
            if(c.compareTo(a)>0)System.out.println(c+" comes after "+a);
            if(c.compareTo(a)==0)System.out.println(c+" equals "+a);
            if(c.equals(a))System.out.println(c+" equals "+a);
        }
    }
}
