# 06 - Matrix Multiplication

This program performs matrix multiplication ($A_{m \times n} \times B_{n \times p} = C_{m \times p}$) on dynamic user-defined 2D integer arrays using triple-nested loops (`O(N^3)` complexity) and linear algebra validation constraints ($c_1 = r_2$).

Mathematical formula implemented:
$$C_{i,j} = \sum_{k=1}^{n} A_{i,k} \cdot B_{k,j}$$
