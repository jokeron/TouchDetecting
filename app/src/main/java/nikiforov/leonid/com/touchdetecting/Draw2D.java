package nikiforov.leonid.com.touchdetecting;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by work on 21.04.16.
 */
public class Draw2D extends View {
    public Draw2D(Context context){
        super(context);
    }
    @Override
    protected void Draw2D(Canvas canvas){
        super.onDraw(canvas);
    }
}
