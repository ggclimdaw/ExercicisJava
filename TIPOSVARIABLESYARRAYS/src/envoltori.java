public class envoltori {
    public static void main(String[] args) {
        Integer inte = Integer.valueOf(12);
        Float flo = Float.valueOf("12.3");
        Float flo_2 = Float.valueOf(12.3F);
        Character charac = Character.valueOf('a');

        System.out.println("inte: " + inte);
        System.out.println("flo: " + flo);
        System.out.println("flo_2: " + flo_2.toString());
        System.out.println("charac: " + charac);

    }

}
