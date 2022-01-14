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

## Graph_DFS is DFS in java

### Description :

Depth- First Search explores edges out of the mmost recently discovered vertex v that still has unexplored edges leaving it.

***Pseudocode DFS***

```
DFS(G)
for each vertex u ∈ G.V
  u.color = WHITE
  u.π = NIL
time =0
for each vertex u ∈ G.V
  if u.color==WHITE
    DFS-VISIT(G,u)
```
```
DFS-VISIT(G,u)
time = time +1
u.d=time
u.color=GRAY
for each v ∈ G.adj[u]
  if v.color == WHITE
    v.π = u
    DFS-VISIT(G,v)
u.color =BLACK
time=time+1
u.f=time
```
**EXPLAINATION**

Besides creating a depth first forest depth-first search also time stamps each vertex .
Each vertex v has two timestamps:
* The first timestamp v.d records when v is first discovered (and grayed) 
* THe second timestamp v.f records when the search finishes examining v's adjacency list (and blackens v)

#### INPUT
It takes number of vertex and edges from user. It then iteratively add edges between source and destination .

#### OUTPUT

IT shows whether a path is possible between source and destination.


![dfs](https://user-images.githubusercontent.com/95691508/149524421-28b507fb-ce9c-4168-887f-e181c965a20a.JPG)

### top_graph.java is TOPOLOGICAL SORT using DFS

## Description :

Topological sorting for Directed Acyclic Graph (DAG) is a linear ordering of vertices such that for every directed edge u v, vertex u comes before v in the ordering. Topological Sorting for a graph is not possible if the graph is not a DAG.
Topological sorting is not possible for a graph is not possible if the graph is not DAG.

***Pseudocode Topological Sort***

```
Topological_Sort(G)
1. Call DFS (G) to complete finishing times v.f for each vertex v
2. as eah vertex is finished insert it onto the from of a linked list
3. return the linked list of vertex
```
### INPUT 

It takes number of vertex and edges from user. It then iteratively add edges between source and destination .

### OUTPUT

It print vertex in topological sort

![tgraph](https://user-images.githubusercontent.com/95691508/149530838-d483a897-e799-4c6f-bc7c-fccce73680f7.JPG)































