class EmptyStringsTest {
    public static boolean isEmpty(String s) {
        return (s == null | s.length() == 0);
    }

    public static void main(String args[]) {
        if (isEmpty(null)) {
            System.out.print("empty ");
        } else {
            System.out.print("not_empty ");
        }
    }
}
