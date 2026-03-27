# [Kadane's Algorithm](https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1)
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">You are given an integer array <strong>arr[].</strong> You need to find the <strong>maximum</strong> sum of a subarray (containing at least one element) in the array <strong>arr[]</strong>.</span></p>
<p><span style="font-size: 14pt;"><strong>Note : </strong><span style="box-sizing: border-box; margin: 0px; padding: 0px; border: 0px; vertical-align: baseline; color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px; background-color: #ffffff;">A&nbsp;</span><strong style="box-sizing: border-box; margin: 0px; padding: 0px; border: 0px; vertical-align: baseline; color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px; background-color: #ffffff;"><strong style="box-sizing: border-box; margin: 0px; padding: 0px; border: 0px; vertical-align: baseline;">subarray</strong></strong><span style="box-sizing: border-box; margin: 0px; padding: 0px; border: 0px; vertical-align: baseline; color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px; background-color: #ffffff;"> is a continuous part of an array.</span></span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [2, 3, -8, 7, -1, 2, 3]
<strong>Output: </strong>11<strong>
Explanation: </strong>The subarray [7, -1, 2, 3] has the largest sum 11.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [-2, -4]
<strong>Output: </strong>-2<strong>
Explanation: </strong>The subarray [-2] has the largest sum -2.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [5, 4, 1, 7, 8]
<strong>Output: </strong>25<strong>
Explanation: </strong>The subarray [5, 4, 1, 7, 8] has the largest sum 25.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:<br></strong>1 ≤ arr.size() ≤ 10<sup>5</sup><strong><br></strong>-</span><span style="font-size: 14pt;">10</span><sup>4</sup> <span style="font-size: 14pt;">≤</span><span style="font-size: 14pt;"> </span><span style="font-size: 14pt;">arr[i] ≤ 10</span><sup>4</sup></p></div>