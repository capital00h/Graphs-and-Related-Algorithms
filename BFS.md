# Graphs-and-Related-Algorithms
BFS , DFS , TOPOLOGICAL SORT IN JAVA


## graph.java is BFS in java
### Description :

Breadth First search is one of the simplest algorithms for searching a graph and the archetype for many important graph algorithms. Example : **Prim's Minimum spanning tree algorithm and Dijkstra's single source shortest Path algorithm** .

***PseudoCode BFS***

```
BFS(G,s)
for each vertex u ∈ G.V-{S}
  u.color=white
  u.d=∞ 
  u.π=NIL
s.color = GRAY
s.d=0
s.π=NIL
Q = Φ
ENQUEUE(Q,S)
while Q ≠ Φ 
  u = DEQUEUE(Q)
  for each v ∈ G.Adj[u]
    if v.color==white
      v.color=GRAY
      v.d=u.d+1
      v.π=u
      ENQUEUE(Q,v)
  u.color=black
```

**EXPLAINATION**

1. IN BFS we first "whitens" all vertex and put d(distance from source s) to ∞.
2. We also put π (predecessor) of each vertex as NIL.
3. We put the source(s) color as GRAY , distance =0 and π (predecessor) as NIL
4. We define an empty queue Q.
5. We put s in Q .
6. while Q is not empty  we dequeue each element of Q and search for its adj[u].
7. If color of found vertex is white we color it GRAY increases the distance with +1 with its initial values and put the correct predecessor.
8. We recolor the used vertex as black

Total Running time of BFS is O(V+E).

#### INPUTS

It takes number of vertex and edges from user. It then iteratively add edges between source and destination . 

#### OUTPUT

Minimum Distance between source and destination entered by user.

![BFS](https://user-images.githubusercontent.com/95691508/149518485-9920b1cf-b87c-4f42-a270-cc30b7838bd2.JPG)
