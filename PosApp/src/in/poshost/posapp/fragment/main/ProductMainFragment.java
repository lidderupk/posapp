package in.poshost.posapp.fragment.main;

import in.poshost.posapp.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class ProductMainFragment extends Fragment {

	private static final String tag = "in.poshost.posapp.fragment.main.ProductMainFragment";

	public ProductMainFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main_product,
				container, false);

		addGesture(rootView);

		return rootView;
	}

	private void addGesture(View view) {
		final GestureDetector gesture = new GestureDetector(getActivity(),
				new GestureDetector.SimpleOnGestureListener() {

					@Override
					public boolean onDown(MotionEvent e) {
						return true;
					}

					@Override
					public boolean onFling(MotionEvent e1, MotionEvent e2,
							float velocityX, float velocityY) {
						Log.i(tag, "onFling has been called!");
						final int SWIPE_MIN_DISTANCE = 120;
						final int SWIPE_MAX_OFF_PATH = 250;
						final int SWIPE_THRESHOLD_VELOCITY = 200;
						try {
							if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH)
								return false;
							if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE
									&& Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
								Log.i(tag, "Right to Left");
							} 
							else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE
									&& Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
								Log.i(tag, "Left to Right");
								Toast.makeText(getActivity(), "Product swiped",  Toast.LENGTH_SHORT).show();
							}
						} catch (Exception e) {
							// nothing
						}
						return super.onFling(e1, e2, velocityX, velocityY);
					}
				});

		view.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				return gesture.onTouchEvent(event);
			}
		});
	}
}