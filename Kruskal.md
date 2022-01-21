# Implementing Kruskal Algorithm using Java

## What is Kruskal Algorithm ?

Kruskal's algorithm finds a minimum spanning forest of an undirected edge-weighted graph. If the graph is connected, it finds a minimum spanning tree. 
It is a greedy algorithm in graph theory as in each step it adds the next lowest-weight edge that will not form a cycle to the minimum spanning forest.

## PseudoCode for Kruskal's Algorithm 

```
MST-KRUSKAL (G,w)
1 A = Ø 
2 for each vertex v ∈ G.V
3     MAKE-SET(v)
4 sort the edges of G.E into nondecreasing order by weight w
5 for each edge (u,v) ∈ G.E taken in nondecreasing order by weight
6     if FIND-SET(u) ≠ FIND-SET(v)
7         A = A ∪ {9u,v)}
8         UNION(u,v)
9 return A
```
``` Make_Set(v)``` creates a new set consisting of the new element ```v```

```FIND-SET(u)``` The operation returns a representative element from the set that contains ```u```

### Steps 

1. Sort all edges in Non- Decreasing Order of weight .
2.  i)   Pick the smallest edge .

    ii)  Check if adding the edge forms CYCLE.
    
    iii) IF Cycle is not formed  ---> INCLUDE Edge 
         
      ELSE ---> EXCLUDE Edge 
         
3. Repeat Step 2 unless (V-1) Edge are included .

#### Running Time of Kruskal's Algorithm is O( E lg V ). 


    
