
package kcochibili.android.sharedpref.turbo.gson.api;

public interface GsonComponent {

	Object fromJson(String json, Class<?> classOfT);

	String toJson(Object obj);

}
