class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int value : nums1) setA.add(value);
        for (int value : nums2) setB.add(value);

        List<Integer> onlyInFirst = new ArrayList<>();
        for (int value : setA) {
            if (!setB.contains(value)) {
                onlyInFirst.add(value);
            }
        }

        List<Integer> onlyInSecond = new ArrayList<>();
        for (int value : setB) {
            if (!setA.contains(value)) {
                onlyInSecond.add(value);
            }
        }

        return List.of(onlyInFirst, onlyInSecond);
    }
}