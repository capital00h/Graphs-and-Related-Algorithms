# Dijkstras.java is Dijkstra's Algorithm in JAVA

### Discription 

It is a greedy algorithm that solves the single source shortest path problem for a direct graph G=(V,E) with non-negative weights , i.e. w(u,v)>=0 for each (u,v) ∈ E.

### Limitations

1. The graph should be weighted and directed .
2. The weight/ cost should be non-negative .

### Pseudocode

```
   Dijkstra(G,w,s)
1. Intialize_single_source(G,s)
2. s = Φ
3. Q = G.V
4. while Q ≠ Φ 
5.    u = Extract_min(Q)
6.    s=s ∪ {u}
7.    for each vertex v ∈ G.adj[u]
8.        Relax(u,v,w)
```

```
   Intialize_single_source(G,s)
1. for each vertex v ∈ G.v
2.       v.d = ∞
3.       v.π = NIL
4. s.d = 0 
```

```
   Relax(u,v,w)
1. if v.d > u.d + w(u,v)
2.       v.d = u.d + w (u,v)
3.       v.π = u
```

### Steps

<ins> Step 1 </ins> Select any veryex as source vertex.  Put the value of the seleted source vertex as "0" and put of other as ∞.

<ins> Step 2 </ins> Relax / Update the connected veretx/ vertices as pure the weight/cost of the connected directed edges.

<ins> Step 3 </ins> Select the next minimum cost/weight vertex and repeat the "step 2' and "step3" .

<ins> Step 4 </ins> We will stop once all vertices are visited .

### Time Complexity is O((V+E)log V)
