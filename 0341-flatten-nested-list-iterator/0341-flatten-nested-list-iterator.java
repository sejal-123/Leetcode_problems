/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
        List<Integer> lst = new ArrayList<>();
        int iterator = 0;



    public NestedIterator(List<NestedInteger> nestedList) {
        flattenList(nestedList);
    }

    public void flattenList(List<NestedInteger> list1) {
        for (NestedInteger i: list1) {
            if (i.isInteger()) {
                lst.add(i.getInteger());
            } else {
                flattenList(i.getList());
            }
        }
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            int val = lst.get(iterator);
            iterator++;
            return val;
        }
        return -1;
    }

    @Override
    public boolean hasNext() {
        return iterator < lst.size();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */