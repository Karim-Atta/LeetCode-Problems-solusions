class Solution {
    public List<String> invalidTransactions(String[] transactions) {
       List<String> res = new ArrayList();
        HashSet<Integer> invalid = new HashSet();
        HashMap<String, ArrayList<Integer>> nameToProperties= new HashMap();
        String[] transactionProperties = new String[4];

        for(int i = 0; i < transactions.length; i++){
            transactionProperties = transactions[i].split(",");
            if(Integer.parseInt(transactionProperties[2]) > 1000){
                invalid.add(i);
            }
            if(nameToProperties.containsKey(transactionProperties[0])){
            
                for(int j : nameToProperties.get(transactionProperties[0])){
                    String[] transactionPropertiesJ =  transactions[j].split(",");
                    // System.out.println(transactionProperties[1]);
                          // System.out.println(transactionPropertiesJ[3]);

                    if(Math.abs(Integer.parseInt(transactionProperties[1]) - Integer.parseInt(transactionPropertiesJ[1])) <=  60 
                     
                                      

                        && !transactionProperties[3].equals(transactionPropertiesJ[3])){
                        invalid.add(i);
                        invalid.add(j);
                    }
                }
                ArrayList<Integer> gg = nameToProperties.get(transactionProperties[0]);
                gg.add(i);
                nameToProperties.put(transactionProperties[0], gg);
                
            }else{
                ArrayList<Integer> dd = new ArrayList();
                dd.add(i);
                nameToProperties.put(transactionProperties[0],  dd);

            }
        }
        List<Integer> list = new ArrayList<Integer>(invalid);
        for(int i : list){
            res.add(transactions[i]);
        }
        return res;
    }
}