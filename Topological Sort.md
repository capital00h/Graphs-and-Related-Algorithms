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
