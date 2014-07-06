package in.poshost.posapp.activities;

import in.poshost.posapp.R;
import in.poshost.posapp.model.Attribute;
import in.poshost.posapp.model.Catalog;
import in.poshost.posapp.model.Dimension;
import in.poshost.posapp.model.Item;

import java.util.List;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.activeandroid.query.Select;

public class MainActivity extends ActionBarActivity {

	private final static String tag = MainActivity.class.getName();//"in.poshost.posapp.activities.MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// if (savedInstanceState == null) {
		// getSupportFragmentManager().beginTransaction()
		// .add(R.id.container, new PlaceholderFragment()).commit();
		// }
		
		setModel();
		getModel();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		Log.i(tag,"this is my message");

		return true;
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private void setModel() {
		// create some catalog and save to file

		Catalog cat = new Catalog();
		cat.description = "catalog 1";
		cat.save();

		for (int i = 0; i < 10; i++) {
			Item item = new Item();
			item.name = "item" + i;
			item.catalog = cat;

			Dimension di = new Dimension();
			di.name = "di" + i;
			di.item = item;

			Attribute att = new Attribute();
			att.name = "att" + i;
			att.dimension = di;

			item.save();
			di.save();
			att.save();
		}
	}

	private void getModel() {
		Catalog cat = new Select().from(Catalog.class).orderBy("RANDOM()")
				.executeSingle();
		List<Item> items = cat.items();
		
		for(Item i: items){
			Log.i(tag, i.name);
		}
		Log.i("", "");
	}

}
