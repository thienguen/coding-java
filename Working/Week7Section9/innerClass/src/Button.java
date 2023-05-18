public class Button {

    // just annouce the click events
    private String title;
    
    // interface that apply at the end of the class
    private OnClickListener onClickLister;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public OnClickListener getOnClickLister() {
        return this.onClickLister;
    }

    public void setOnClickListener(OnClickListener onClickLister) {
        this.onClickLister = onClickLister;
    }

    public Button(String title) {
        this.title = title;
    }

    public void onClick() {
        this.onClickLister.onClick(this.title);
    }

    public interface OnClickListener {
        public void onClick(String title);
    }

}
