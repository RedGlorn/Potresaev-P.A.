public class TextEditor implements TextWriter{

    private TextRender textRender;
    public TextEditor(TextRender textRender){
        this.textRender = textRender;
    }
    @Override
    public void writeTextWithTextRenderParameters() {
        textRender.setFront();
        textRender.setFrontSize();
    }
}