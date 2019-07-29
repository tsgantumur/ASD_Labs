package lab6.CoR;

public interface IChain {
	public abstract void setNext(IChain nextChain);
	public abstract void process(CallRecord callRecord);
}
