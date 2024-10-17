# 3.Polymorphism-shape-game-part-2

### Assignment: 3 
Create a new interface for objects that need the new gravity behaviour.
Implement that Interface in the Shapes you would like to see fall down.


### Assignment: 4
Extend the new class `GravityUpdate` with a `List<>` of the new interface type, you just created.
Make sure you can fill the list with new Objects. On all the objects in the list, call the new method.

### Assignment: 5
Add some logic to make the shapes fall down.
Here is an example that worked for me.
```java
 if (self == null)
     return;

    y++;
    ((Ellipse2D.Double) self).y = y;
```

Lets brake it doen:
My method was called to soon. So I made added a null check, to avoid errors.
```java
 if (self == null)
     return;
```

I introduced some new local fields, `self` and `y`.
```java
public void draw(Graphics2D g2d) {
    g2d.setColor(Color.BLUE);
    self = new Ellipse2D.Double(100, y, 50, 50);
    g2d.fill(self);
}
```

I needed those 2 fields to keep e reference to the Shape object and the `y` variable to keep a reference to the position. 
```java
y++;
((Ellipse2D.Double) self).y = y;
```