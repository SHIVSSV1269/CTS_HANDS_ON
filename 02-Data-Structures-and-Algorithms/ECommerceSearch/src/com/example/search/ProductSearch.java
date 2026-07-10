package com.example.search;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Implements and compares Linear Search and Binary Search for products by id.
 *
 * Big O summary:
 *   Linear Search  - O(n)      (checks each element; no ordering needed)
 *   Binary Search  - O(log n)  (requires the array to be sorted first)
 *
 * Best / Average / Worst cases:
 *   Linear:  best O(1) (first element), avg O(n/2)=O(n),  worst O(n)
 *   Binary:  best O(1) (middle element), avg O(log n),    worst O(log n)
 */
public class ProductSearch {

    /** Linear search over an unsorted array. Returns index or -1. */
    public static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == targetId) {
                return i;
            }
        }
        return -1;
    }

    /** Binary search over an array that is SORTED by productId. Returns index or -1. */
    public static int binarySearch(Product[] sortedProducts, int targetId) {
        int low = 0;
        int high = sortedProducts.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midId = sortedProducts[mid].getProductId();
            if (midId == targetId) {
                return mid;
            } else if (midId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Wireless Mouse", "Electronics"),
            new Product(101, "Coffee Mug", "Kitchen"),
            new Product(110, "Yoga Mat", "Fitness"),
            new Product(103, "Notebook", "Stationery"),
            new Product(108, "Desk Lamp", "Home")
        };

        int target = 110;

        // ---- Linear search on the unsorted array ----
        int linearIndex = linearSearch(products, target);
        System.out.println("Linear search for id " + target + ": " +
                (linearIndex >= 0 ? "found at index " + linearIndex + " -> " + products[linearIndex]
                                  : "not found"));

        // ---- Binary search requires a sorted array ----
        Product[] sorted = products.clone();
        Arrays.sort(sorted, Comparator.comparingInt(Product::getProductId));
        System.out.println("Sorted by id: " + Arrays.toString(sorted));

        int binaryIndex = binarySearch(sorted, target);
        System.out.println("Binary search for id " + target + ": " +
                (binaryIndex >= 0 ? "found at index " + binaryIndex + " -> " + sorted[binaryIndex]
                                  : "not found"));

        System.out.println("\nComparison:");
        System.out.println("  Linear Search : O(n)     - simple, works on unsorted data, best for small/unsorted sets.");
        System.out.println("  Binary Search : O(log n) - much faster for large data sets, but needs a sorted array.");
        System.out.println("  For an e-commerce catalog that is large and can be kept sorted/indexed, binary search");
        System.out.println("  (or a hash/tree index) is preferred for fast lookups.");
    }
}
