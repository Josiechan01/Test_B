public class CartonBoxCalculator {
    public static void main(String[] args) {
        int boxWidth = 320;
        int boxHeight = 260;
        int boxDepth = 200;

        int productWidth = 210;
        int productHeight = 35;
        int productDepth = 35;

        int maxProducts = calculateMaxProducts(boxWidth, boxHeight, boxDepth, productWidth, productHeight, productDepth);
        System.out.println("Maximum number of products that can fit in the carton box: " + maxProducts);
    }

    public static int calculateMaxProducts(int boxWidth, int boxHeight, int boxDepth, int productWidth, int productHeight, int productDepth) {
        int maxProductsWithRotation = 0;

        // Calculate maximum number of products without rotation
        int maxProductsWithoutRotation = (boxWidth / productWidth) * (boxHeight / productHeight) * (boxDepth / productDepth);

        // Calculate maximum number of products with rotation
        int maxProductsWithWidthRotation = (boxWidth / productHeight) * (boxHeight / productWidth) * (boxDepth / productDepth);
        int maxProductsWithHeightRotation = (boxWidth / productWidth) * (boxHeight / productHeight) * (boxDepth / productDepth);
        int maxProductsWithDepthRotation = (boxWidth / productWidth) * (boxHeight / productDepth) * (boxDepth / productHeight);

        // Find the maximum among all rotation possibilities
        maxProductsWithRotation = Math.max(maxProductsWithWidthRotation, Math.max(maxProductsWithHeightRotation, maxProductsWithDepthRotation));

        // Return the maximum number of products
        return Math.max(maxProductsWithoutRotation, maxProductsWithRotation);
    }
}