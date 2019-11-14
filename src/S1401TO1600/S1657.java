package S1401TO1600;

import java.util.HashMap;
import java.util.Map;

public class S1657 {
    public int operationTime(int[] op, int[] a) {
        // Write your code here.
        Map<Integer, Integer> opMins = new HashMap<>();
        int res = 0;
        for (int i = 0; i < op.length ; i++)
            opMins.put(op[i], Math.min(a[i], opMins.getOrDefault(op[i], Integer.MAX_VALUE)));
        for (int i = 0; i < op.length; i++)
            res = Math.max(res, Math.abs(a[i] - opMins.get(op[i])));
        return res;
    }

    public static void main(String[] args)
    {
        S1657 s = new S1657();
        int[] op = new int[] {121,173,131,191,86,117,23,15,93,141,169,101,1,153,145,141,33,92,219,119,219,213,51,15,114,207,76,103,187,16,228,96,148,61,117,77,16,122,51,125,46,50,208,31,15,109,181,81,102,211,111,161,73,196,162,39,21,136,67,11,209,8,145,178,191,192,35,157,215,53,111,225,69,61,202,110,93,131,192,171,229,101,191,100,229,211,220,1,161,48,120,111,27,78,221,174,121,147,87,141,71,37,81,186,181,185,47,1,51,196,207,91,76,202,139,1,166,87,121,95,163,3,176,205,55,84,14,8,142,146,171,43,97,139,126,111,60,209,173,85,166,213,91,93,23,142,51,15,205,221,183,93,69,41,83,199,93,175,10,179,173,29,31,161,135,101,125,135,129,217,50,21,172,175,211,48,64,205,71,29,116,65,69,72,152,171,29,1,101,75,53,201,1,141,201,219,112,186,93,1,51,171,103,197,24,175,147,52,135,189,164,181,123,21,161,139,37,21,81,115,63,103,157,184,127,171,75,161,99,47,185,96,141,1,152,103,111,25,105,41,65,195,226,169,225,75,179,183,201,217,131,173,141,33,19,14,118,175,209,149,73,35,61,6,25,151,49,17,47,11,63,21,202,27,81,19,131,61,137,93,51,73,21,110,200,59,82,230,145,11,128,14,171,118,185,41,46,125,47,73,194,68,11,61,109,144,34,185,63,11,193,50,187,121,29,197,69,125,177,53,81,46,147,195,175,115,79,133,121,95,1,208,185,63,191,175,217,2,51,138,83,146,43,39,175,193,69,183,25,139,211,137,170,45,43,129,230,165,24,77,191,141,31,81,35,81,166,207,122,159,227,7,171,20,151,49,106,137,59,148,111,124,92,151,61,141,165,185,101,81,163,33,141,194,217,212,103,27,224,115,201,7,222,143,133,179,25,179,9,153,35,27,57,163,126,114,223,59,46,97,137,33,212,7,35,107,191,1,191,205,121,79,111,146,86,51,196,70,65,11,89,139,7,192,121,66,20,181,203,59,141,113,61,51,71,47,15,193,19,198,39,227,221,182,191,89,157,61,121,130,180,123,21,47,121,3,55,159,229,211,191,123,111,211,60,16,158,133,179,198,201,205,35,39,108,53,15,98,1,1,107,32,154,157,59,31,213,169,162,183,56,99,41,131,99,204,125,105,39,17,126,209,201,27,137,161,151,153,172,24,121,117,101,171,229,41,221,61,118,155,203,116,219,226,218,35,73,159,1,46,206,186,153,139,170,87,33,11,207,14,85,35,225,133,21,47,216,225,191,113,51,17,193,97,1,67,221,61,156,35,47,81,50,57,211,6,214,223,49,229,217,172,77,72,156,141,221,169,95,119,112,70,129,171,91,16,71,81,193,221,192,151,3,213,109,186,196,180,213,134,221,225,91,203,43,101,186,11,41,145,113,223,164,171,193,146,37,105,39,230,47,53,216,131,91,11,62,166,103,61,50,18,37,156,107,11,176,143,5,31,83,115,107,28,49,21,114,61,136,16,53,2,14,11,166,179,119,74,167,131,43,34,97,17,224,181,116,163,143,61,221,179};
        int[] a = new int[] {862,99,1,417,733,481,457,401,353,801,601,541,811,969,967,586,999,237,441,969,107,929,155,51,121,881,861,131,381,658,63,605,637,457,825,81,481,169,529,744,142,609,590,921,455,943,393,539,481,263,961,517,809,110,911,943,412,142,196,236,909,321,955,569,505,769,331,60,71,46,35,749,40,570,71,961,1,41,9,881,883,41,205,167,313,883,561,575,954,408,203,115,857,643,823,694,470,993,805,1,549,941,955,501,221,747,723,327,759,733,307,606,202,261,153,676,270,584,121,153,713,803,630,141,326,993,998,235,865,337,887,425,740,484,754,177,469,470,883,137,121,322,353,65,985,51,918,849,752,414,839,266,989,366,395,571,128,341,822,764,369,405,440,465,981,739,893,206,237,359,89,1,326,192,704,236,676,521,583,647,129,124,349,861,805,357,643,601,401,577,576,725,81,325,181,193,10,830,31,537,677,697,411,103,157,723,926,236,342,309,81,211,647,381,2,149,598,187,235,485,153,951,206,4,891,165,861,821,894,593,376,121,124,141,44,466,243,441,105,699,817,202,747,513,85,125,453,183,57,517,249,323,91,523,183,917,33,160,121,946,155,391,881,311,215,681,647,684,561,293,561,51,305,766,819,117,777,121,905,696,811,91,491,19,408,497,201,397,147,285,107,329,313,193,289,593,213,103,551,513,321,945,701,784,753,601,406,502,290,253,621,47,701,81,897,155,271,683,899,383,986,805,311,851,876,73,75,851,841,449,301,706,181,229,725,611,315,223,273,785,175,553,537,651,113,387,547,621,343,201,173,377,740,937,136,746,425,609,721,789,361,907,492,981,389,113,334,559,798,714,241,551,139,501,521,983,778,382,362,127,169,452,133,349,880,581,569,509,176,49,717,521,966,807,626,281,16,226,412,786,707,79,951,523,87,599,347,201,791,444,542,864,411,965,553,427,406,77,611,1,243,483,945,793,246,689,160,133,131,719,556,547,452,350,855,973,26,206,693,502,889,217,74,401,89,581,379,875,492,72,481,20,666,589,835,94,28,521,811,101,702,125,557,771,723,29,665,157,567,701,556,781,320,861,697,653,304,305,111,93,945,561,751,981,377,14,439,291,929,653,851,489,427,749,101,990,382,913,889,124,266,546,489,211,980,347,585,172,617,601,342,141,747,947,313,965,350,866,825,406,635,738,929,1,712,835,740,166,727,665,425,577,945,881,428,41,141,883,877,597,381,491,434,151,500,66,179,953,380,641,869,152,491,961,1,121,1,337,585,5,957,977,211,777,516,913,82,345,127,470,373,209,267,345,473,713,891,573,481,671,640,89,505,681,441,281,325,771,683,893,721,877,201,835,470,379,401,374,496,27,601,861,929,1000,521,569,481,831,129,113,315,521,430,745,53,903,481,401,238,737,989,601,206,871,999,977,882,971,689,116,746,457,585,365,341,57,867,301,869,225,561,513,727,571,357,981,577,289,185,886,595,919,546,272,188,426,628,497,183,65,682,439,901,624,1,125,601,11,235,417,158,525,97,375,419,425,991,351,501,807,698,271,367,226,485,310,601,446,71,957,725,531};
        int res = s.operationTime(op,a);
        System.out.println(res);
    }
}
