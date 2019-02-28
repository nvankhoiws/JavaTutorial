package core.self.corejavabook.stream.impl;

import core.self.corejavabook.stream.OptionalManipulation;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by KhoiNV6@vttek.vn on 2/28/19
 **/
public class OptinalManipulationImpl implements OptionalManipulation {
	public static void main(String[] args) {
		OptionalManipulation optionalManipulation = new OptinalManipulationImpl();
//		optionalManipulation.createOptional();
		optionalManipulation.combineOptionalWithFlatMap();
	}

	@Override
	public Void createOptional() {
		// handle
		OptionalInt.empty().ifPresentOrElse(
				value -> System.out.println(value*10),
				() -> System.out.println("empty optional value"));
		if (OptionalInt.empty().isPresent()) {
			System.out.println(OptionalInt.of(10).getAsInt()*10);
		} else {
			System.out.println("empty optional value");
		}
		return null;
	}

	@Override
	public Void combineOptionalWithFlatMap() {
//		System.out.println(inverse(4.0).flatMap(OptinalManipulationImpl::squareRoot));
//		System.out.println(inverse(-1.0).flatMap(OptinalManipulationImpl::squareRoot));
//		System.out.println(inverse(0.0).flatMap(OptinalManipulationImpl::squareRoot));
//		Optional<Double> result3 = Optional.of(-4.0).flatMap(OptinalManipulationImpl::inverse)
//				.flatMap(OptinalManipulationImpl::squareRoot);
//		System.out.println("result3: " + result3);
//
		Stream<String> ids = Stream.of("gboole", "jgosling");
		Stream<User> users = ids.map(Users::lookup)
				.filter(Optional::isPresent)
				.map(Optional::get);
		show("users", users);
//
//		ids = Stream.of("gboole", "jgosling");
//		users = ids.map(Users::lookup)
//				.flatMap(Optional::stream);
//		show("users", users);
//
//		ids = Stream.of("gboole", "jgosling");
//		users = ids.map(Users::classicLookup)
//				.filter(Objects::nonNull);
//		show("users", users);
//
//		ids = Stream.of("gboole", "jgosling");
//		users = ids.flatMap(
//				id -> Stream.ofNullable(Users.classicLookup(id)));
//		show("users", users);
//
//		ids = Stream.of("gboole", "jgosling");
//		users = ids.map(Users::classicLookup)
//				.flatMap(Stream::ofNullable);
//		show("users", users);
		return null;
	}

	@Override
	public Void turnOptionalIntoStream() {
		return null;
	}

	public static Optional<Double> inverse(Double x) {
		return x == 0 ? Optional.empty() : Optional.of(1 / x);
	}

	public static Optional<Double> squareRoot(Double x) {
		return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
	}

	public static <T> void show(String title, Stream<T> stream) {
		final int SIZE = 10;
		List<T> firstElements = stream.limit(SIZE + 1).collect(Collectors.toList());
		System.out.print(title + ": ");
		if (firstElements.size() <= SIZE)
			System.out.println(firstElements);
		else {
			firstElements.remove(SIZE);
			String out = firstElements.toString();
			System.out.println(out.substring(0, out.length() - 1) + ", ...]");
		}
	}
}

class Users {
	private static User[] users = {
			new User("gboole", "George Boole"),
			new User("achurch", "Alonzo Church"),
			new User("hcurry", "Haskell Curry")
	};

	public static Optional<User> lookup(String id) {
		return Stream.of(users).filter(u -> u.getId().equals(id)).findFirst();
	}

	public static User classicLookup(String id) {
		for (User u : users) {
			if (u.getId().equals(id)) return u;
		}
		return null;
	}
}

class User{
	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name;
	}

	private String id;
	private String name;
}