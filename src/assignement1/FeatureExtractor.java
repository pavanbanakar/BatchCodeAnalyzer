package assignement1;

import java.util.Vector;

public class FeatureExtractor {
	 public static Vector<int[]> ProjectionHistograms(int[][] result, int NumberOfRowsOriginal, int NumberOfColumnsOriginal)
     {
         // Horizontal Histogram
         int[] m_HorizontalFeatureVector = new int[NumberOfRowsOriginal];
         int[] m_VerticalFeatureVector = new int[NumberOfColumnsOriginal];
         for (int i = 0; i < NumberOfRowsOriginal; i++)
         {
             int count = 0;
             for (int j = 0; j < NumberOfColumnsOriginal; j++)
             {
                 if (result[i][j] == 0)
                 {
                     count++;
                 }

             }
             m_HorizontalFeatureVector[i] = count;
         }
         // Vertical Histogram
         for (int j = 0; j < NumberOfColumnsOriginal; j++)
         {
             int count = 0;
             for (int i = 0; i < NumberOfRowsOriginal; i++)
             {
                 if (result[i][j] == 0)
                 {
                     count++;
                 }

             }
             m_VerticalFeatureVector[j] = count;
         }
        
        Vector<int[]> objNewVector = new Vector<int[]>();
        objNewVector.add(m_HorizontalFeatureVector);
        objNewVector.add(m_VerticalFeatureVector);
 return objNewVector;
     }

}