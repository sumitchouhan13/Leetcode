class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> res = new ArrayList<>();
        for(int i=0;i<searchWord.length();i++){
            String s = searchWord.substring(0,i+1);
            List<String> temp = new ArrayList<>();
            for(int j=0;j<products.length;j++){
                if(products[j].startsWith(s)) temp.add(products[j]);
                if(temp.size()==3) break;
            }
            res.add(temp);
        }
        return res;
    }
}