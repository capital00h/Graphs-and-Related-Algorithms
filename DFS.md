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
