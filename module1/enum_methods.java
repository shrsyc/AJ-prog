enum color{RED,WHITE,BLUE,GREEN,YELLOW}
class colors{
    public static void main(String[] args) {
        color a=color.BLUE;
        System.out.println(color.valueOf("BLUE")); //------------------------------------> valueOf()             
        for(color c:color.values()){//-------------------------------------------------------------->values()
            System.out.println(c+" ordinal value is "+c.ordinal());//----------------------->ordinal()
            if(c.compareTo(a)<0)System.out.println(c+" comes before "+a);//    --}
            if(c.compareTo(a)>0)System.out.println(c+" comes after "+a);//     --}-->compareTo()
            if(c.compareTo(a)==0)System.out.println(c+" equals "+a);//         --}
            if(c.equals(a))System.out.println(c+" equals "+a);//---------------------->equals()
        }
    }
}
