import java.util.Scanner; 
 
interface WaterConservationSystem { 
    int calculateTrappedWater(int[] blockHeights); 
} 
 
abstract class RainySeasonConservation implements WaterConservationSystem { 
    public abstract int calculateTrappedWater(int[] blockHeights); 
} 
 
class CityBlockConservation extends RainySeasonConservation { 
    public int calculateTrappedWater(int[] blockHeights) { 
        int n = blockHeights.length; 
        if (n == 0) return 0; 
 
        int[] leftMax = new int[n]; 
        int[] rightMax = new int[n]; 
 
        leftMax[0] = blockHeights[0]; 
        for (int i = 1; i < n; i++) { 
            leftMax[i] = Math.max(leftMax[i - 1], blockHeights[i]); 
        } 
 
        rightMax[n - 1] = blockHeights[n - 1]; 
        for (int i = n - 2; i >= 0; i--) { 
            rightMax[i] = Math.max(rightMax[i + 1], blockHeights[i]); 
        } 
 
        int waterTrapped = 0; 
        for (int i = 0; i < n; i++) { 
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - blockHeights[i]; 
        } 
 
        return waterTrapped; 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.println("Enter the number of blocks:"); 
        int n = scanner.nextInt(); 
        int[] blockHeights = new int[n]; 
 
        System.out.println("Enter the heights of the blocks:"); 
        for (int i = 0; i < n; i++) { 
            blockHeights[i] = scanner.nextInt(); 
        } 
 
        CityBlockConservation conservation = new CityBlockConservation(); 
        System.out.println("Water Trapped: " + conservation.calculateTrappedWater(blockHeights)); 
 
 
 
    } 
} 
 
interface WaterConservationSystem { 
    int calculateTrappedWater(int[] blockHeights); 
} 
 
abstract class RainySeasonConservation implements WaterConservationSystem { 
    public abstract int calculateTrappedWater(int[] blockHeights); 
} 
 
class CityBlockConservation extends RainySeasonConservation { 
    public int calculateTrappedWater(int[] blockHeights) { 
        int n = blockHeights.length; 
        if (n == 0) return 0; 
 
        int[] leftMax = new int[n]; 
        int[] rightMax = new int[n]; 
 
        leftMax[0] = blockHeights[0]; 
        for (int i = 1; i < n; i++) { 
            leftMax[i] = Math.max(leftMax[i - 1], blockHeights[i]); 
        } 
 
        rightMax[n - 1] = blockHeights[n - 1]; 
        for (int i = n - 2; i >= 0; i--) { 
            rightMax[i] = Math.max(rightMax[i + 1], blockHeights[i]); 
        } 
 
        int waterTrapped = 0; 
        for (int i = 0; i < n; i++) { 
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - blockHeights[i]; 
        } 
 
        return waterTrapped; 
    } 
} 
 
public class WaterConservationTest { 
    public static void main(String[] args) { 
        CityBlockConservation conservation = new CityBlockConservation(); 
 
        int[] blockHeights1 = {3, 0, 2, 0, 4}; 
        System.out.println("Water Trapped: " + conservation.calculateTrappedWater(blockHeights1));  
    } 
}  