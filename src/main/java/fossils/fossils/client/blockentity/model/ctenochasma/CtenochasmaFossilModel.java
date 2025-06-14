package fossils.fossils.client.blockentity.model.ctenochasma;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CtenochasmaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body1;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart tail;
	private final ModelPart chest;
	private final ModelPart leftwing6;
	private final ModelPart leftwing7;
	private final ModelPart leftwing8;
	private final ModelPart leftmembrane;
	private final ModelPart lefthand;
	private final ModelPart rightwing6;
	private final ModelPart rightwing7;
	private final ModelPart rightwing8;
	private final ModelPart rightmembrane;
	private final ModelPart righthand;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftHead;
	private final ModelPart rightHead;

	public CtenochasmaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body1 = this.root.getChild("body1");
		this.leftleg = this.body1.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.rightleg = this.body1.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.tail = this.body1.getChild("tail");
		this.chest = this.root.getChild("chest");
		this.leftwing6 = this.chest.getChild("leftwing6");
		this.leftwing7 = this.leftwing6.getChild("leftwing7");
		this.leftwing8 = this.leftwing7.getChild("leftwing8");
		this.leftmembrane = this.leftwing8.getChild("leftmembrane");
		this.lefthand = this.leftwing8.getChild("lefthand");
		this.rightwing6 = this.chest.getChild("rightwing6");
		this.rightwing7 = this.rightwing6.getChild("rightwing7");
		this.rightwing8 = this.rightwing7.getChild("rightwing8");
		this.rightmembrane = this.rightwing8.getChild("rightmembrane");
		this.righthand = this.rightwing8.getChild("righthand");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftHead = this.head.getChild("leftHead");
		this.rightHead = this.head.getChild("rightHead");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0F, 1.1F, 0.4974F, 0.0F, 0.0F));

		PartDefinition body1 = root.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.25F, 1.75F, -0.2456F, 0.2543F, -0.063F));

		PartDefinition cube_r1 = body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 58).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.028F, -0.8021F, 0.8465F, 0.0463F, 0.2106F, -0.0573F));

		PartDefinition cube_r2 = body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(39, 7).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9197F, -0.2894F, 1.2145F, 0.2732F, 0.2106F, -0.0573F));

		PartDefinition cube_r3 = body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(5, 54).mirror().addBox(-1.1095F, -0.6005F, -0.4961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3824F, -0.707F, 0.3018F, 0.1613F, 0.0921F, -0.1407F));

		PartDefinition cube_r4 = body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 27).mirror().addBox(-0.8F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -1.4742F, 0.6562F, -0.2679F, 0.2106F, -0.0573F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(31, 42).mirror().addBox(-1.1F, -0.2948F, -0.2203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(31, 42).addBox(0.1F, -0.2948F, -0.2203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 44).addBox(-0.5F, -0.2948F, -0.2203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, -1.7898F, 0.1974F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 27).addBox(-0.2F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, -1.4742F, 0.6562F, -0.2679F, -0.2106F, 0.0573F));

		PartDefinition cube_r6 = body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 7).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9197F, -0.2894F, 1.2145F, 0.2732F, -0.2106F, 0.0573F));

		PartDefinition cube_r7 = body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(39, 58).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.028F, -0.8021F, 0.8465F, 0.0463F, -0.2106F, 0.0573F));

		PartDefinition cube_r8 = body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 54).addBox(0.1095F, -0.6005F, -0.4961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3824F, -0.707F, 0.3018F, 0.1613F, -0.0921F, 0.1407F));

		PartDefinition cube_r9 = body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 6).addBox(-2.0824F, -0.4876F, -1.0442F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5824F, -0.707F, 0.3018F, 0.161F, 0.0F, 0.0F));

		PartDefinition leftleg = body1.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -1.05F, 0.8F, 0.5633F, -0.0702F, -1.242F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create().texOffs(21, 39).addBox(-0.5694F, -0.1405F, -0.4998F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0276F, 1.6927F, -0.4558F, 0.4808F, -0.2184F, 0.1965F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create().texOffs(8, 25).addBox(-1.1124F, -0.4472F, -2.507F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0694F, 3.4345F, -0.0498F, 1.2162F, 0.2407F, 0.2122F));

		PartDefinition rightleg = body1.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, -1.05F, 0.8F, 0.5633F, 0.0702F, 1.242F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create().texOffs(16, 39).addBox(-0.4306F, -0.1405F, -0.4998F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0276F, 1.6927F, -0.4558F, 0.4808F, 0.2184F, -0.1965F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create().texOffs(0, 22).addBox(-0.8876F, -0.4472F, -2.507F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0694F, 3.4345F, -0.0498F, 1.2162F, -0.2407F, -0.2122F));

		PartDefinition tail = body1.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(7, 41).addBox(-0.5F, -0.3F, -0.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(58, 41).addBox(-0.5F, -0.3F, 0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.425F, 1.8F, -0.2633F, 0.2615F, -0.0117F));

		PartDefinition chest = root.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, 2.05F, 0.0418F, 0.3917F, -0.0123F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(25, 19).addBox(0.0F, -0.2754F, -0.2133F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.8898F, -2.1305F, -0.3403F, 0.0F, 0.0F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(18, 19).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.3196F, -0.7832F, -0.1609F, -0.2095F, -0.8809F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(8, 13).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7196F, -2.2832F, 0.0166F, 0.0052F, -0.7243F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(8, 3).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7196F, -2.2832F, 0.0129F, 0.0118F, -1.1606F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(5, 17).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.9196F, -3.8832F, 0.1332F, 0.0419F, -0.6692F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.9196F, -3.8832F, 0.1032F, 0.0942F, -1.1034F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(25, 44).mirror().addBox(-1.0176F, -0.65F, -0.8981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0029F, -0.849F, -4.3506F, 0.1979F, 0.5195F, -0.6388F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(12, 32).mirror().addBox(-1.0311F, -2.1947F, -1.6474F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4732F, 0.8228F, -3.4727F, -0.1355F, 0.4571F, -0.1486F));

		PartDefinition chest_r7 = chest.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(18, 19).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.3196F, -0.7832F, -0.1609F, 0.2095F, 0.8809F));

		PartDefinition chest_r8 = chest.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(8, 13).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7196F, -2.2832F, 0.0166F, -0.0052F, 0.7243F));

		PartDefinition chest_r9 = chest.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(8, 3).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7196F, -2.2832F, 0.0129F, -0.0118F, 1.1606F));

		PartDefinition chest_r10 = chest.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(5, 17).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.9196F, -3.8832F, 0.1332F, -0.0419F, 0.6692F));

		PartDefinition chest_r11 = chest.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(0, 17).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.9196F, -3.8832F, 0.1032F, -0.0942F, 1.1034F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(12, 32).addBox(0.0311F, -2.1947F, -1.6474F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4732F, 0.8228F, -3.4727F, -0.1355F, -0.4571F, 0.1486F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(25, 44).addBox(0.0176F, -0.65F, -0.8981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0029F, -0.849F, -4.3506F, 0.1979F, -0.5195F, 0.6388F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 37).addBox(-1.5F, -0.8F, -0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8739F, -4.2232F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(47, 58).addBox(-0.5F, -1.0558F, -0.9959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0739F, -4.5232F, -0.5149F, 0.0F, 0.0F));

		PartDefinition chest_r12 = chest.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, -0.8131F, -0.2617F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.5F, -0.6898F, -4.7305F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftwing6 = chest.addOrReplaceChild("leftwing6", CubeListBuilder.create().texOffs(31, 18).addBox(1.1F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(34, 38).addBox(0.1F, -0.5F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(1.4F, -0.45F, -3.8F, -0.2622F, -0.1731F, -0.2911F));

		PartDefinition leftwing7 = leftwing6.addOrReplaceChild("leftwing7", CubeListBuilder.create().texOffs(12, 16).addBox(-0.507F, -0.1174F, -0.2007F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(13, 13).addBox(-0.507F, 0.5826F, -0.2007F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.9F, -0.1F, -0.7F, -0.0126F, 0.2245F, -0.0662F));

		PartDefinition cube_r16 = leftwing7.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(38, 44).addBox(-0.7F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.493F, 0.3826F, -0.4007F, 0.0F, -0.5236F, 0.0F));

		PartDefinition leftwing8 = leftwing7.addOrReplaceChild("leftwing8", CubeListBuilder.create().texOffs(25, 9).addBox(-5.0F, -0.5F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.493F, 0.5826F, -0.2007F, -3.0893F, 0.2525F, -2.9859F));

		PartDefinition leftmembrane = leftwing8.addOrReplaceChild("leftmembrane", CubeListBuilder.create().texOffs(0, 19).addBox(-5.75F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.75F, 0.0F, -0.5F, 0.0041F, -0.2525F, -0.0801F));

		PartDefinition cube_r17 = leftmembrane.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(8, 0).addBox(-6.9F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.45F, 0.0F, 0.0F, 0.0132F, -0.087F, -0.0428F));

		PartDefinition lefthand = leftwing8.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.25F, 0.0922F, 0.0606F, 0.0084F));

		PartDefinition cube_r18 = lefthand.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 40).addBox(-1.05F, -0.5F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition rightwing6 = chest.addOrReplaceChild("rightwing6", CubeListBuilder.create().texOffs(30, 3).addBox(-5.1F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(27, 36).addBox(-2.1F, -0.5F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-1.4F, -0.45F, -3.8F, -0.2876F, 0.1256F, 0.1212F));

		PartDefinition rightwing7 = rightwing6.addOrReplaceChild("rightwing7", CubeListBuilder.create().texOffs(13, 3).addBox(-6.493F, -0.1174F, -0.2007F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(8, 10).addBox(-6.493F, 0.5826F, -0.2007F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-4.9F, -0.1F, -0.7F, -0.0126F, -0.2245F, 0.0662F));

		PartDefinition cube_r19 = rightwing7.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 28).addBox(-1.3F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-5.493F, 0.3826F, -0.4007F, 0.0F, 0.5236F, 0.0F));

		PartDefinition rightwing8 = rightwing7.addOrReplaceChild("rightwing8", CubeListBuilder.create().texOffs(25, 0).addBox(0.0F, -0.5F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.493F, 0.5826F, -0.2007F, -3.0893F, -0.2525F, 2.9859F));

		PartDefinition rightmembrane = rightwing8.addOrReplaceChild("rightmembrane", CubeListBuilder.create().texOffs(17, 6).addBox(-0.25F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.75F, 0.0F, -0.5F, 0.0041F, 0.2525F, 0.0801F));

		PartDefinition cube_r20 = rightmembrane.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 7).addBox(-0.1F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.45F, 0.0F, 0.0F, 0.0132F, 0.087F, 0.0428F));

		PartDefinition righthand = rightwing8.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, -0.25F, 0.0922F, -0.0606F, -0.0084F));

		PartDefinition cube_r21 = righthand.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(39, 24).addBox(0.05F, -0.5F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(42, 14).addBox(-0.5F, -0.411F, -1.7302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.1398F, -4.6805F, -0.1294F, 0.2615F, 0.0117F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0862F, -1.4431F, -0.0982F, 0.1261F, -0.0352F));

		PartDefinition cube_r22 = neck2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(32, 21).addBox(-0.5F, -0.3869F, -0.3955F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, -0.4186F, -2.3315F, -0.1396F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3186F, -2.4315F, 0.2242F, 0.2577F, 0.0465F));

		PartDefinition cube_r23 = neck3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.2F, -0.5411F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.35F, -2.05F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(32, 26).addBox(-0.5F, -0.4044F, -2.5687F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 0.1392F, -5.5197F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(28, 31).addBox(-0.5F, -0.4146F, -2.4973F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.1608F, -4.0197F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(39, 29).addBox(-0.5F, -0.3749F, -1.5866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.399F)), PartPose.offsetAndRotation(0.0F, -0.5608F, -3.7197F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(40, 19).addBox(-0.5F, -0.3678F, -1.7625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(0.0F, -0.5608F, -2.5197F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -0.3678F, -1.5625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.5608F, -2.5197F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(41, 36).addBox(-0.5F, -0.1678F, -1.7625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5608F, -2.5197F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(44, 23).addBox(-1.5F, -0.1736F, -0.84F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5F, -1.0608F, -0.4197F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(40, 33).addBox(-1.5F, -0.2088F, -1.3574F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 11).addBox(-1.5F, -0.2088F, -0.7574F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.5F, -0.8608F, 0.6803F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(39, 40).addBox(-0.5F, -0.7F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5F, -0.1762F, -0.2835F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(35, 12).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.5F, 0.0152F, -0.7455F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(61, 2).addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2F, 0.4392F, -0.9197F, -0.6109F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1459F, -0.6076F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r35 = jaw.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(29, 13).mirror().addBox(-0.5F, -0.5872F, -2.4962F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4577F, -2.3787F, 0.0881F, -0.1391F, -0.0122F));

		PartDefinition cube_r36 = jaw.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(11, 19).mirror().addBox(-0.4F, -0.5377F, -3.5609F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.6713F, -7.3466F, -0.0524F, -0.0174F, 0.0009F));

		PartDefinition cube_r37 = jaw.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(18, 21).mirror().addBox(-0.4F, -0.5362F, -3.5591F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5932F, -4.512F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r38 = jaw.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(34, 33).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2932F, -0.137F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r39 = jaw.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(45, 18).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(46, 31).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(30, 46).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.092F, 0.3109F, -10.3243F, 1.2415F, -0.0963F, -1.0479F));

		PartDefinition cube_r40 = jaw.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(40, 48).mirror().addBox(-0.3447F, -2.116F, -2.8763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(26, 48).mirror().addBox(-0.3447F, -2.316F, -2.8763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(15, 48).mirror().addBox(-0.3447F, -2.516F, -2.8763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3193F, 0.6446F, -7.2051F, 0.6089F, -0.0793F, -0.9982F));

		PartDefinition cube_r41 = jaw.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(50, 42).mirror().addBox(-0.3447F, -1.754F, -2.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(48, 13).mirror().addBox(-0.3447F, -1.954F, -2.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(10, 48).mirror().addBox(-0.3447F, -2.154F, -2.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3193F, 0.6446F, -7.2051F, 0.4692F, -0.0793F, -0.9982F));

		PartDefinition cube_r42 = jaw.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(17, 45).mirror().addBox(-0.3447F, -1.7419F, -2.4248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(7, 45).mirror().addBox(-0.3447F, -1.9419F, -2.4248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(12, 45).mirror().addBox(-0.3447F, -2.1419F, -2.4248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3193F, 0.6446F, -7.2051F, 0.5914F, -0.0793F, -0.9982F));

		PartDefinition cube_r43 = jaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(46, 8).mirror().addBox(-0.3447F, -1.4947F, -2.2531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(45, 43).mirror().addBox(-0.3447F, -1.2947F, -2.2531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3193F, 0.6446F, -7.2051F, 0.4692F, -0.0793F, -0.9982F));

		PartDefinition cube_r44 = jaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(5, 48).mirror().addBox(-0.3447F, -1.1001F, -2.006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 48).mirror().addBox(-0.3447F, -0.9001F, -2.006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3193F, 0.6446F, -7.2051F, 0.2773F, -0.0793F, -0.9982F));

		PartDefinition cube_r45 = jaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.3447F, -1.0163F, -1.6912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(44, 50).mirror().addBox(-0.3447F, -0.8163F, -1.6912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3193F, 0.6446F, -7.2051F, 0.2947F, -0.0793F, -0.9982F));

		PartDefinition cube_r46 = jaw.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(60, 8).mirror().addBox(-0.3447F, -0.9105F, -1.3667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(10, 60).mirror().addBox(-0.3447F, -0.7105F, -1.3667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3193F, 0.6446F, -7.2051F, 0.3296F, -0.0793F, -0.9982F));

		PartDefinition cube_r47 = jaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(48, 61).mirror().addBox(-0.3447F, -0.7907F, -1.0339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(61, 13).mirror().addBox(-0.3447F, -0.5907F, -1.0339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3193F, 0.6446F, -7.2051F, 0.3296F, -0.0793F, -0.9982F));

		PartDefinition cube_r48 = jaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(59, 55).mirror().addBox(-0.3839F, -1.1521F, -2.1271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(52, 59).mirror().addBox(-0.3839F, -1.3521F, -2.1271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3009F, 0.4564F, -5.6541F, 0.4655F, 0.0235F, -1.0001F));

		PartDefinition cube_r49 = jaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(5, 60).mirror().addBox(-0.3839F, -0.9006F, -1.8633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(59, 49).mirror().addBox(-0.3839F, -1.1006F, -1.8633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3009F, 0.4564F, -5.6541F, 0.3608F, 0.0235F, -1.0001F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(53, 47).mirror().addBox(-0.4756F, -0.7158F, -1.5828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(38, 55).mirror().addBox(-0.4756F, -0.9158F, -1.5828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3009F, 0.4564F, -5.6541F, 0.352F, -0.0463F, -0.9972F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(30, 55).mirror().addBox(-0.4756F, -0.6052F, -1.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(58, 46).mirror().addBox(-0.4756F, -0.8052F, -1.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3009F, 0.4564F, -5.6541F, 0.3171F, -0.0463F, -0.9972F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(55, 25).mirror().addBox(-0.4634F, -0.4571F, -1.7237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(15, 55).mirror().addBox(-0.4634F, -0.6571F, -1.7237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(55, 8).mirror().addBox(-0.4634F, -0.4571F, -1.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(54, 50).mirror().addBox(-0.4634F, -0.6571F, -1.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(54, 44).mirror().addBox(-0.4634F, -0.4571F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(54, 39).mirror().addBox(-0.4634F, -0.4571F, -0.8237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(54, 35).mirror().addBox(-0.4634F, -0.4571F, -0.5237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(54, 31).mirror().addBox(-0.4634F, -0.4571F, -0.2237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(25, 54).mirror().addBox(-0.4634F, -0.4571F, 0.0763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(10, 54).mirror().addBox(-0.4634F, -0.4571F, 0.3763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.324F, 0.3944F, -4.9576F, 0.1201F, 0.0271F, -0.9977F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(26, 24).mirror().addBox(-0.2088F, -0.4041F, -0.4245F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4577F, -4.4787F, 0.1579F, -0.1391F, -0.0122F));

		PartDefinition cube_r54 = jaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(26, 24).addBox(-0.7912F, -0.4041F, -0.4245F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(0.5F, 0.4577F, -4.4787F, 0.1579F, 0.1391F, 0.0122F));

		PartDefinition cube_r55 = jaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(29, 13).addBox(-0.5F, -0.5872F, -2.4962F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.5F, 0.4577F, -2.3787F, 0.0881F, 0.1391F, 0.0122F));

		PartDefinition cube_r56 = jaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(11, 19).addBox(-0.6F, -0.5377F, -3.5609F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2F, 0.6713F, -7.3466F, -0.0524F, 0.0174F, -0.0009F));

		PartDefinition cube_r57 = jaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(18, 21).addBox(-0.6F, -0.5362F, -3.5591F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3F, 0.5932F, -4.512F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r58 = jaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(34, 33).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.2932F, -0.137F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r59 = jaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(45, 18).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(46, 31).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(30, 46).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.092F, 0.3109F, -10.3243F, 1.2415F, 0.0963F, 1.0479F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(40, 48).addBox(-0.6553F, -2.116F, -2.8763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(26, 48).addBox(-0.6553F, -2.316F, -2.8763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(15, 48).addBox(-0.6553F, -2.516F, -2.8763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3193F, 0.6446F, -7.2051F, 0.6089F, 0.0793F, 0.9982F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(50, 42).addBox(-0.6553F, -1.754F, -2.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(48, 13).addBox(-0.6553F, -1.954F, -2.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 48).addBox(-0.6553F, -2.154F, -2.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3193F, 0.6446F, -7.2051F, 0.4692F, 0.0793F, 0.9982F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(17, 45).addBox(-0.6553F, -1.7419F, -2.4248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(7, 45).addBox(-0.6553F, -1.9419F, -2.4248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(12, 45).addBox(-0.6553F, -2.1419F, -2.4248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3193F, 0.6446F, -7.2051F, 0.5914F, 0.0793F, 0.9982F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(46, 8).addBox(-0.6553F, -1.4947F, -2.2531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(45, 43).addBox(-0.6553F, -1.2947F, -2.2531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3193F, 0.6446F, -7.2051F, 0.4692F, 0.0793F, 0.9982F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(5, 48).addBox(-0.6553F, -1.1001F, -2.006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 48).addBox(-0.6553F, -0.9001F, -2.006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3193F, 0.6446F, -7.2051F, 0.2773F, 0.0793F, 0.9982F));

		PartDefinition cube_r65 = jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 51).addBox(-0.6553F, -1.0163F, -1.6912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(44, 50).addBox(-0.6553F, -0.8163F, -1.6912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3193F, 0.6446F, -7.2051F, 0.2947F, 0.0793F, 0.9982F));

		PartDefinition cube_r66 = jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(60, 8).addBox(-0.6553F, -0.9105F, -1.3667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 60).addBox(-0.6553F, -0.7105F, -1.3667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3193F, 0.6446F, -7.2051F, 0.3296F, 0.0793F, 0.9982F));

		PartDefinition cube_r67 = jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(48, 61).addBox(-0.6553F, -0.7907F, -1.0339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(61, 13).addBox(-0.6553F, -0.5907F, -1.0339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3193F, 0.6446F, -7.2051F, 0.3296F, 0.0793F, 0.9982F));

		PartDefinition cube_r68 = jaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(59, 55).addBox(-0.6161F, -1.1521F, -2.1271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(52, 59).addBox(-0.6161F, -1.3521F, -2.1271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3009F, 0.4564F, -5.6541F, 0.4655F, -0.0235F, 1.0001F));

		PartDefinition cube_r69 = jaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(5, 60).addBox(-0.6161F, -0.9006F, -1.8633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(59, 49).addBox(-0.6161F, -1.1006F, -1.8633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3009F, 0.4564F, -5.6541F, 0.3608F, -0.0235F, 1.0001F));

		PartDefinition cube_r70 = jaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(53, 47).addBox(-0.5244F, -0.7158F, -1.5828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(38, 55).addBox(-0.5244F, -0.9158F, -1.5828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3009F, 0.4564F, -5.6541F, 0.352F, 0.0463F, 0.9972F));

		PartDefinition cube_r71 = jaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(30, 55).addBox(-0.5244F, -0.6052F, -1.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(58, 46).addBox(-0.5244F, -0.8052F, -1.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3009F, 0.4564F, -5.6541F, 0.3171F, 0.0463F, 0.9972F));

		PartDefinition cube_r72 = jaw.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(55, 25).addBox(-0.5366F, -0.4571F, -1.7237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(15, 55).addBox(-0.5366F, -0.6571F, -1.7237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(55, 8).addBox(-0.5366F, -0.4571F, -1.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(54, 50).addBox(-0.5366F, -0.6571F, -1.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(54, 44).addBox(-0.5366F, -0.4571F, -1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(54, 39).addBox(-0.5366F, -0.4571F, -0.8237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(54, 35).addBox(-0.5366F, -0.4571F, -0.5237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(54, 31).addBox(-0.5366F, -0.4571F, -0.2237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(25, 54).addBox(-0.5366F, -0.4571F, 0.0763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 54).addBox(-0.5366F, -0.4571F, 0.3763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.324F, 0.3944F, -4.9576F, 0.1201F, -0.0271F, 0.9977F));

		PartDefinition leftHead = head.addOrReplaceChild("leftHead", CubeListBuilder.create(), PartPose.offset(0.2F, 0.5172F, -7.2542F));

		PartDefinition cube_r73 = leftHead.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6F, -0.5885F, -4.1712F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r74 = leftHead.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(22, 29).addBox(-0.5F, -0.0501F, -0.5307F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2F, -0.6781F, 1.2346F, 0.1833F, 0.0873F, 0.0F));

		PartDefinition cube_r75 = leftHead.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(6, 30).addBox(-0.5F, -0.0543F, -0.4618F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2F, -0.6781F, 1.2346F, 0.0785F, 0.0873F, 0.0F));

		PartDefinition cube_r76 = leftHead.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 10).addBox(-0.6F, -0.5042F, -0.2838F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.0781F, -0.1654F, 0.035F, 0.0698F, 0.0024F));

		PartDefinition cube_r77 = leftHead.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(9, 37).addBox(-0.78F, -0.8446F, -2.0033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(18, 34).addBox(-0.9F, -0.744F, -2.0033F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, -0.2781F, 5.8346F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition cube_r78 = leftHead.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(20, 53).addBox(-0.32F, -0.6443F, -0.49F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(53, 22).addBox(-0.43F, -0.6443F, -0.49F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(53, 18).addBox(-0.49F, -0.6443F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -1.0683F, 6.6073F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftHead.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(54, 3).addBox(-0.49F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(43, 60).addBox(-0.49F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.3F, -0.9027F, 6.3571F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftHead.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(45, 53).addBox(-0.38F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(34, 53).addBox(-0.38F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(53, 13).addBox(-0.38F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4F, -0.4306F, 6.5497F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftHead.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(58, 37).addBox(-0.3671F, -0.3447F, -0.556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1053F, 0.021F, 2.8012F, 0.1636F, 0.0609F, -0.9967F));

		PartDefinition cube_r82 = leftHead.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(58, 33).addBox(-0.3671F, -0.2461F, -0.9094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(15, 58).addBox(-0.3671F, -0.2461F, -1.2094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(58, 5).addBox(-0.3671F, -0.0461F, -1.2094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(25, 57).addBox(-0.3671F, -0.0461F, -1.5094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(34, 57).addBox(-0.3671F, -0.2461F, -1.5094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(57, 15).addBox(-0.3671F, -0.2461F, -1.8094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(57, 20).addBox(-0.3671F, -0.0461F, -1.8094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 57).addBox(-0.3671F, -0.2461F, -2.1094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(57, 11).addBox(-0.3671F, -0.0461F, -2.1094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(57, 0).addBox(-0.3671F, -0.2461F, -2.4094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(5, 57).addBox(-0.3671F, -0.0461F, -2.4094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(54, 56).addBox(-0.3671F, -0.2461F, -2.7094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 57).addBox(-0.3671F, -0.0461F, -2.7094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(56, 28).addBox(-0.3671F, -0.2461F, -3.0094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(43, 56).addBox(-0.3671F, -0.0461F, -3.0094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(49, 55).addBox(-0.3671F, 0.0539F, -3.0094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)), PartPose.offsetAndRotation(-0.1053F, 0.021F, 2.8012F, -0.0633F, 0.0609F, -0.9967F));

		PartDefinition cube_r83 = leftHead.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(20, 56).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 54).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(53, 53).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0206F, 0.1494F, -0.0278F, -0.3076F, 0.0609F, -0.9967F));

		PartDefinition cube_r84 = leftHead.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(29, 59).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(59, 23).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0052F, 0.1544F, -0.3266F, -0.3426F, 0.0609F, -0.9967F));

		PartDefinition cube_r85 = leftHead.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(58, 52).addBox(-0.4038F, -0.3333F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(58, 58).addBox(-0.4038F, 0.0667F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(20, 59).addBox(-0.4038F, -0.1333F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2052F, 0.1544F, -0.5266F, -0.3514F, -0.0088F, -1.0002F));

		PartDefinition cube_r86 = leftHead.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(15, 61).addBox(-0.5091F, -0.5023F, -0.642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(61, 17).addBox(-0.5091F, -0.1023F, -0.642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(24, 61).addBox(-0.5091F, -0.3023F, -0.642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0052F, 0.1544F, -0.8266F, -0.4561F, -0.0088F, -1.0002F));

		PartDefinition cube_r87 = leftHead.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(60, 26).addBox(-0.4525F, -0.2188F, -0.6423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(60, 30).addBox(-0.4525F, -0.0188F, -0.6423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(34, 60).addBox(-0.4525F, -0.4188F, -0.6423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1052F, 0.1544F, -1.1266F, -0.3863F, -0.0088F, -1.0002F));

		PartDefinition cube_r88 = leftHead.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(51, 28).addBox(-0.392F, -0.3317F, -0.7006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(49, 51).addBox(-0.392F, -0.1317F, -0.7006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(52, 0).addBox(-0.392F, -0.5317F, -0.7006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.042F, 0.2633F, -1.4691F, -0.3863F, -0.0088F, -1.0002F));

		PartDefinition cube_r89 = leftHead.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(47, 0).addBox(-0.4463F, -0.2204F, -0.6423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(21, 47).addBox(-0.4463F, -0.0204F, -0.6423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(35, 47).addBox(-0.4463F, -0.4204F, -0.6423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1052F, 0.1544F, -1.8266F, -0.3514F, -0.0088F, -1.0002F));

		PartDefinition cube_r90 = leftHead.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(46, 35).addBox(-0.3897F, -0.137F, -0.6426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(46, 40).addBox(-0.3897F, 0.063F, -0.6426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(44, 46).addBox(-0.3897F, -0.337F, -0.6426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2052F, 0.1544F, -2.1266F, -0.3339F, -0.0088F, -1.0002F));

		PartDefinition cube_r91 = leftHead.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(15, 52).addBox(-0.4411F, -0.2218F, -0.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(29, 52).addBox(-0.4411F, -0.0218F, -0.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(40, 52).addBox(-0.4411F, -0.4218F, -0.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1052F, 0.1544F, -2.4266F, -0.5259F, -0.0088F, -1.0002F));

		PartDefinition cube_r92 = leftHead.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(51, 6).addBox(-0.6041F, -0.4303F, -0.4679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 51).addBox(-0.6041F, -0.2303F, -0.4679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(24, 51).addBox(-0.6041F, -0.0303F, -0.4679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(5, 51).addBox(-0.6041F, 0.1697F, -0.4679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1052F, -0.0456F, -3.0266F, -0.6481F, -0.0088F, -1.0002F));

		PartDefinition cube_r93 = leftHead.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(50, 10).addBox(-0.6006F, 0.2282F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(50, 37).addBox(-0.6006F, -0.3718F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(19, 50).addBox(-0.6006F, -0.1718F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(50, 25).addBox(-0.6006F, 0.0282F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1052F, -0.0456F, -3.4266F, -0.5259F, -0.0088F, -1.0002F));

		PartDefinition cube_r94 = leftHead.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(49, 20).addBox(-0.5979F, 0.0776F, -0.3896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(36, 50).addBox(-0.5979F, -0.5224F, -0.3896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(31, 49).addBox(-0.5979F, -0.3224F, -0.3896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(49, 45).addBox(-0.5979F, -0.1224F, -0.3896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1052F, -0.0456F, -3.7266F, -0.6655F, -0.0088F, -1.0002F));

		PartDefinition cube_r95 = leftHead.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(48, 48).addBox(-0.5979F, 0.0776F, -0.4896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(50, 33).addBox(-0.5979F, -0.5224F, -0.4896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(49, 3).addBox(-0.5979F, -0.3224F, -0.4896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(49, 16).addBox(-0.5979F, -0.1224F, -0.4896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1052F, -0.0456F, -3.7266F, -1.2939F, -0.0088F, -1.0002F));

		PartDefinition cube_r96 = leftHead.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -0.6F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0104F, -0.6058F, 5.3649F, 0.1678F, 0.09F, 0.0512F));

		PartDefinition cube_r97 = leftHead.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(44, 4).addBox(-0.8F, -0.1588F, -1.7425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, -1.4781F, 6.1346F, 0.2895F, 0.1004F, 0.0298F));

		PartDefinition rightHead = head.addOrReplaceChild("rightHead", CubeListBuilder.create(), PartPose.offset(-0.2F, 0.5172F, -7.2542F));

		PartDefinition cube_r98 = rightHead.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.4F, -0.5885F, -4.1712F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r99 = rightHead.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(22, 29).mirror().addBox(-0.5F, -0.0501F, -0.5307F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.6781F, 1.2346F, 0.1833F, -0.0873F, 0.0F));

		PartDefinition cube_r100 = rightHead.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(6, 30).mirror().addBox(-0.5F, -0.0543F, -0.4618F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.6781F, 1.2346F, 0.0785F, -0.0873F, 0.0F));

		PartDefinition cube_r101 = rightHead.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-0.4F, -0.5042F, -0.2838F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0781F, -0.1654F, 0.035F, -0.0698F, -0.0024F));

		PartDefinition cube_r102 = rightHead.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(9, 37).mirror().addBox(-0.22F, -0.8446F, -2.0033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(18, 34).mirror().addBox(-0.1F, -0.744F, -2.0033F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.2781F, 5.8346F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition cube_r103 = rightHead.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(20, 53).mirror().addBox(-0.68F, -0.6443F, -0.49F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(53, 22).mirror().addBox(-0.57F, -0.6443F, -0.49F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(53, 18).mirror().addBox(-0.51F, -0.6443F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.0683F, 6.6073F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightHead.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(54, 3).mirror().addBox(-0.51F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(43, 60).mirror().addBox(-0.51F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.9027F, 6.3571F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightHead.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(45, 53).mirror().addBox(-0.62F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(34, 53).mirror().addBox(-0.62F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(53, 13).mirror().addBox(-0.62F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4306F, 6.5497F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightHead.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(58, 37).mirror().addBox(-0.6329F, -0.3447F, -0.556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1053F, 0.021F, 2.8012F, 0.1636F, -0.0609F, 0.9967F));

		PartDefinition cube_r107 = rightHead.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(58, 33).mirror().addBox(-0.6329F, -0.2461F, -0.9094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(15, 58).mirror().addBox(-0.6329F, -0.2461F, -1.2094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(58, 5).mirror().addBox(-0.6329F, -0.0461F, -1.2094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(25, 57).mirror().addBox(-0.6329F, -0.0461F, -1.5094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(34, 57).mirror().addBox(-0.6329F, -0.2461F, -1.5094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(57, 15).mirror().addBox(-0.6329F, -0.2461F, -1.8094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(57, 20).mirror().addBox(-0.6329F, -0.0461F, -1.8094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(10, 57).mirror().addBox(-0.6329F, -0.2461F, -2.1094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(57, 11).mirror().addBox(-0.6329F, -0.0461F, -2.1094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(57, 0).mirror().addBox(-0.6329F, -0.2461F, -2.4094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(5, 57).mirror().addBox(-0.6329F, -0.0461F, -2.4094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(54, 56).mirror().addBox(-0.6329F, -0.2461F, -2.7094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 57).mirror().addBox(-0.6329F, -0.0461F, -2.7094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(56, 28).mirror().addBox(-0.6329F, -0.2461F, -3.0094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(43, 56).mirror().addBox(-0.6329F, -0.0461F, -3.0094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(49, 55).mirror().addBox(-0.6329F, 0.0539F, -3.0094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false), PartPose.offsetAndRotation(0.1053F, 0.021F, 2.8012F, -0.0633F, -0.0609F, 0.9967F));

		PartDefinition cube_r108 = rightHead.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(20, 56).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 54).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(53, 53).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.0206F, 0.1494F, -0.0278F, -0.3076F, -0.0609F, 0.9967F));

		PartDefinition cube_r109 = rightHead.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(29, 59).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(59, 23).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0052F, 0.1544F, -0.3266F, -0.3426F, -0.0609F, 0.9967F));

		PartDefinition cube_r110 = rightHead.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(58, 52).mirror().addBox(-0.5962F, -0.3333F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(58, 58).mirror().addBox(-0.5962F, 0.0667F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(20, 59).mirror().addBox(-0.5962F, -0.1333F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.2052F, 0.1544F, -0.5266F, -0.3514F, 0.0088F, 1.0002F));

		PartDefinition cube_r111 = rightHead.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(15, 61).mirror().addBox(-0.4909F, -0.5023F, -0.642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(61, 17).mirror().addBox(-0.4909F, -0.1023F, -0.642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(24, 61).mirror().addBox(-0.4909F, -0.3023F, -0.642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0052F, 0.1544F, -0.8266F, -0.4561F, 0.0088F, 1.0002F));

		PartDefinition cube_r112 = rightHead.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(60, 26).mirror().addBox(-0.5475F, -0.2188F, -0.6423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(60, 30).mirror().addBox(-0.5475F, -0.0188F, -0.6423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(34, 60).mirror().addBox(-0.5475F, -0.4188F, -0.6423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1052F, 0.1544F, -1.1266F, -0.3863F, 0.0088F, 1.0002F));

		PartDefinition cube_r113 = rightHead.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(51, 28).mirror().addBox(-0.608F, -0.3317F, -0.7006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(49, 51).mirror().addBox(-0.608F, -0.1317F, -0.7006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(52, 0).mirror().addBox(-0.608F, -0.5317F, -0.7006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.042F, 0.2633F, -1.4691F, -0.3863F, 0.0088F, 1.0002F));

		PartDefinition cube_r114 = rightHead.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(47, 0).mirror().addBox(-0.5537F, -0.2204F, -0.6423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(21, 47).mirror().addBox(-0.5537F, -0.0204F, -0.6423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(35, 47).mirror().addBox(-0.5537F, -0.4204F, -0.6423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1052F, 0.1544F, -1.8266F, -0.3514F, 0.0088F, 1.0002F));

		PartDefinition cube_r115 = rightHead.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(46, 35).mirror().addBox(-0.6103F, -0.137F, -0.6426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(46, 40).mirror().addBox(-0.6103F, 0.063F, -0.6426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(44, 46).mirror().addBox(-0.6103F, -0.337F, -0.6426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.2052F, 0.1544F, -2.1266F, -0.3339F, 0.0088F, 1.0002F));

		PartDefinition cube_r116 = rightHead.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(15, 52).mirror().addBox(-0.5589F, -0.2218F, -0.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(29, 52).mirror().addBox(-0.5589F, -0.0218F, -0.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(40, 52).mirror().addBox(-0.5589F, -0.4218F, -0.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1052F, 0.1544F, -2.4266F, -0.5259F, 0.0088F, 1.0002F));

		PartDefinition cube_r117 = rightHead.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(51, 6).mirror().addBox(-0.3959F, -0.4303F, -0.4679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(10, 51).mirror().addBox(-0.3959F, -0.2303F, -0.4679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(24, 51).mirror().addBox(-0.3959F, -0.0303F, -0.4679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(5, 51).mirror().addBox(-0.3959F, 0.1697F, -0.4679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1052F, -0.0456F, -3.0266F, -0.6481F, 0.0088F, 1.0002F));

		PartDefinition cube_r118 = rightHead.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 10).mirror().addBox(-0.3994F, 0.2282F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(50, 37).mirror().addBox(-0.3994F, -0.3718F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(19, 50).mirror().addBox(-0.3994F, -0.1718F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(50, 25).mirror().addBox(-0.3994F, 0.0282F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1052F, -0.0456F, -3.4266F, -0.5259F, 0.0088F, 1.0002F));

		PartDefinition cube_r119 = rightHead.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(49, 20).mirror().addBox(-0.4021F, 0.0776F, -0.3896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(36, 50).mirror().addBox(-0.4021F, -0.5224F, -0.3896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(31, 49).mirror().addBox(-0.4021F, -0.3224F, -0.3896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(49, 45).mirror().addBox(-0.4021F, -0.1224F, -0.3896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1052F, -0.0456F, -3.7266F, -0.6655F, 0.0088F, 1.0002F));

		PartDefinition cube_r120 = rightHead.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(48, 48).mirror().addBox(-0.4021F, 0.0776F, -0.4896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(50, 33).mirror().addBox(-0.4021F, -0.5224F, -0.4896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(49, 3).mirror().addBox(-0.4021F, -0.3224F, -0.4896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(49, 16).mirror().addBox(-0.4021F, -0.1224F, -0.4896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1052F, -0.0456F, -3.7266F, -1.2939F, 0.0088F, 1.0002F));

		PartDefinition cube_r121 = rightHead.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(-0.5F, -0.6F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0104F, -0.6058F, 5.3649F, 0.1678F, -0.09F, -0.0512F));

		PartDefinition cube_r122 = rightHead.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(44, 4).mirror().addBox(-0.2F, -0.1588F, -1.7425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.4781F, 6.1346F, 0.2895F, -0.1004F, -0.0298F));

		return LayerDefinition.create(meshdefinition, 65, 65);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}