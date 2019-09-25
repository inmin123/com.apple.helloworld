public void listSort1(){
 
        List<Integer> list = new ArrayList<Integer>();
 
        list.add(1);
 
        list.add(55);
 
        list.add(9);
 
        list.add(0);
 
        list.add(2);
 
        Collections.sort(list);
 
        for(int a :list){
 
            System.out.println(a);
 
        }
 
    }
