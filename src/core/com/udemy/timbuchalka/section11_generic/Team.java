package core.com.udemy.timbuchalka.section11_generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/20/20171:14 PM.
 */
public class Team <T extends Player> implements Comparable<Team<T>>{

    private String name;

    private int played = 0;

    private int won = 0;

    private int lost = 0;

    private int tied = 0;

    List<T> list;

    public Team(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    public void addPlayer(T player) {
        if (list.contains(player)){
            System.out.println(((Player) player).getName() + " alreadt in the team");
        } else {
            list.add(player);
            System.out.println(((Player) player).getName() + " added to the team");
        }
    }

    public void matchResult(Team<T> opponent, int ourscore, int theirscore){
        this.played++;
        String message = "";
        if (ourscore == theirscore) {
            this.tied++;
            message = " tied with ";
        } else if (ourscore > theirscore){
            this.won++;
            message = " won to ";
        } else {
            this.lost++;
            message = " loose before ";
        }

        if (opponent != null) {
            System.out.println(getName() + message + opponent.getName());
            opponent.matchResult(null, theirscore, ourscore);
        }
    }

    public int ranking(){
        return won * 3 + tied * 1;
    }

    public int size(){
        return this.list.size();
    }

    public String getName() {
        return this.name;
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     * <p>
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     * <p>
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     * <p>
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     * <p>
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     * <p>
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param team the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Team<T> team) {
        return (this.ranking() > team.ranking()) ? -1 : (this.ranking() == team.ranking() ? 0 : 1);
    }
}
